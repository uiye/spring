package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileUploadController {
	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/upload")
	public String upLoad(MultipartFile myfile) {
		String url = "E:\\Test_UpLoad_File";
		String fileName = myfile.getOriginalFilename();
		String path = url + File.separator + fileName;
		File file = new File(path);
		try {
			myfile.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}
}
