package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ecsite/book")
public class BookController {
	
	@RequestMapping("/")
	public String index() {
		return "booktop";
	}
	

}
