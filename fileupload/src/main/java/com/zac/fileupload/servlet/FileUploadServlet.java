package com.zac.fileupload.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/fileUploadServlet")
public class FileUploadServlet extends HttpServlet {
       
	private static final long serialVersionUID = 4992944789018180685L;
	
	File tempFile;
	
	File uploadFile;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadServlet() {
        super();
    }

	@Override
	public void init() throws ServletException {
		tempFile = new File(this.getServletContext().getRealPath("/tmp"));
		uploadFile = new File(this.getServletContext().getRealPath("/upload"));
		
		if (!tempFile.exists()) {
			tempFile.mkdir();
		} 
		
		if (!uploadFile.exists()) {
			uploadFile.mkdir();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long start = System.currentTimeMillis();
		
		request.setCharacterEncoding("UTF-8");
		DiskFileItemFactory factory = new DiskFileItemFactory(4096, tempFile);
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(1000000);
		
		try {
			List<FileItem> items = upload.parseRequest(request);
			
			String fileName = null;
			for (FileItem item : items) {
				if (item.isFormField()) {
					continue;
				} else {
					fileName = item.getName();
					
					if (fileName == null || "".equals(fileName) || item.getSize() == 0) {
						continue;
					} 
					fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
					item.write(new File(uploadFile, fileName));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
