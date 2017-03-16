package com.zac.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {
	
	private static final String UI_PATH = "/";

	@RequestMapping(value = "")
	public String home() {
		return UI_PATH + "upload";
	}
	
	@RequestMapping(value = "/upload/pic")
	public void picUpload() {
		
	}
}
