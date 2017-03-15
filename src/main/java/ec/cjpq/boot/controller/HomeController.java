package ec.cjpq.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

	@RequestMapping("/")
	public String home(){
		return "Das boot, reporting by duty";
	}
}
