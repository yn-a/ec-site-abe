package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ecsite/movie")
public class MovieController {
	
	@RequestMapping("/")
	public String index() {
		return "movietop";
	}

}
