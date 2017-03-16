package com.zac.fileupload.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/partServlet")
@MultipartConfig
public class PartServlet extends HttpServlet {
	
	private static final long serialVersionUID = -8919266118544537758L;
	
	File uploadFile;
	
	public PartServlet() {
		super();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		uploadFile = new File(
				this.getServletContext().getRealPath("/upload"));
		if (!uploadFile.exists()) {
			uploadFile.mkdir();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long start = System.currentTimeMillis();
		req.setCharacterEncoding("UTF-8");
		Part part = req.getPart("partfile");
		String header = part.getHeader("content-disposition");
		String clientPath = header.substring(header.indexOf("filename=\"") + 10, header.lastIndexOf("\""));
		String fileName = clientPath.substring(clientPath.lastIndexOf("\\") + 1);
		String filePath = uploadFile.getPath();
		String uploadPath = filePath + File.separator + fileName;
		write(part.getInputStream(), uploadPath);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	private void write(InputStream in, String path) {
		OutputStream out = null;
		try {
			out = new FileOutputStream(path);
	        byte[] buffer = new byte[1024];
	        int length = -1;
	        while ((length = in.read(buffer)) != -1) {
	            out.write(buffer, 0, length);
	        }
	        
		} catch (Exception e) {
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        
	}
}
