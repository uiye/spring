package mvc.ajax.controller;

import mvc.ajax.entity.Alcohol;
import mvc.ajax.service.AlcoholService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/alcohol")
public class AlcoholController {

	private final String FILE_DIRECTORY = "E:\\Test_UpLoad_File";

	@Autowired
	private AlcoholService service;

	@GetMapping("/index")
	public String alcoholIndex() {
		return "index";
	}


	@GetMapping("/list")
	@ResponseBody
	public List<Alcohol> queryAlcohol() {
		return service.queryAlcohol(1,10);
	}

	@PostMapping("/login")
	public String login(String username, Integer password, HttpSession session) {
		System.out.println(username + password);
		if (("admin".equals(username)) && (12345 == password)) {
			System.out.println("Login================");
			session.setAttribute("name",true);
			return "redirect:index";
		}
		return "redirect:/";
	}

	@PostMapping("/upload")
	public String upload(MultipartFile myfile) {
		String filename = myfile.getOriginalFilename();
		String path = FILE_DIRECTORY + File.separator + filename;
		File file = new File(path);
		try {
			myfile.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:index";
	}

	@GetMapping("/download")
	public ResponseEntity<InputStreamSource> download(String filename) throws UnsupportedEncodingException, FileNotFoundException {
		String fullPath = FILE_DIRECTORY + File.separator + filename;
		File file = new File(fullPath);
		String mediaType = URLConnection.guessContentTypeFromName(filename);
		if (mediaType == null) {
			mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
		}
		System.out.println("===========" + mediaType);
		HttpHeaders respHeaders = new HttpHeaders();
		respHeaders.setContentType(MediaType.parseMediaType(mediaType));
		respHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(filename,"UTF-8"));
		InputStreamResource isr =
				new InputStreamResource(new FileInputStream(file));
		return new ResponseEntity<>(isr, respHeaders, HttpStatus.OK);
	}
}
