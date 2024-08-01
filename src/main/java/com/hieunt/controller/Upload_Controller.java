package com.hieunt.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;

@Controller
public class Upload_Controller {
	@Autowired
	ServletContext app;
	
	@GetMapping("/upload/form")
	public String showForm() {
		return "UploadFile";
	}
	
	@PostMapping("/upload/save")
	public String send(@RequestParam("attach") MultipartFile attach) throws IOException, IllegalStateException {
		if(!attach.isEmpty()) {
			String fileName = attach.getOriginalFilename();
			File file = new File(app.getRealPath("/docs/"+fileName));
			attach.transferTo(file);
		}
		return "upload/success";
	}
}
