package com.zac.fileupload.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {
	
	private static final String UI_PATH = "/";

	@RequestMapping(value = "")
	public String home() {
		return UI_PATH + "upload";
	}
	
	@RequestMapping(value = "/pic1")
	public void picUpload1(@RequestParam("file3") MultipartFile file, 
	                      HttpServletRequest request, HttpServletResponse response) {
		long start = System.currentTimeMillis();
		if (file == null) {
            return ;
        }
		String fileName = file.getOriginalFilename();
		File uploadPath = new File(request.getSession().getServletContext().getRealPath("/upload"));
		if (!uploadPath.exists()) {
		    uploadPath.mkdir();
        }
		
		File uploadFile = new File(uploadPath, fileName);
		try {
            file.transferTo(uploadFile);
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}
	
	@RequestMapping(value = "/pic2")
	public void picUpload2(@RequestParam("file4") MultipartFile file, HttpServletRequest request) {
	    long start = System.currentTimeMillis();
	    if (file == null) {
            return;
        }
	    
	    File uploadPath = new File(request.getSession().getServletContext().getRealPath("/upload"));
	    if (!uploadPath.exists()) {
	        uploadPath.mkdir();
        }
	    
	    InputStream in = null;
	    OutputStream out = null;
	    try {
	        String fileName = file.getOriginalFilename();
	        
	        //未使用缓冲区
            /*out = new FileOutputStream(uploadPath.getPath() + File.separator + fileName);
            
            in = file.getInputStream();
            int len = 0;
            while((len = in.read()) != -1) {
                out.write(len);
            }*/
	        
	        //使用缓冲区
	        out = new BufferedOutputStream(new FileOutputStream(uploadPath.getPath() + File.separator + fileName));
	        in = new BufferedInputStream(file.getInputStream());
	        byte[] buffer = new byte[1024 * 2];
	        int len = 0;
	        while((len = in.read(buffer)) != -1) {
	            out.write(buffer, 0, len);
	        }
        } catch (Exception e) {
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
            }
        }
	    long end = System.currentTimeMillis();
	    System.out.println(end - start);
	}
	
	@RequestMapping(value = "/pic3", method = RequestMethod.POST)
	public void picUpload3(HttpServletRequest request) {
	    long start = System.currentTimeMillis();
	    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	    
	    Iterator<String> fileNames = multipartRequest.getFileNames();
	    if (fileNames != null) {
            while(fileNames.hasNext()) {
                MultipartFile file = multipartRequest.getFile(fileNames.next());
                String fileName = file.getOriginalFilename();
                
                File uploadPath = new File(request.getSession().getServletContext().getRealPath("/upload"));
                if (!uploadPath.exists()) {
                    uploadPath.mkdir();
                }
                File uploadFile = new File(uploadPath, fileName);
                try {
                    file.transferTo(uploadFile);
                } catch (Exception e) {
                }
            }
        }
	    
	    long end = System.currentTimeMillis();
	    System.out.println(end - start);
	}
}
