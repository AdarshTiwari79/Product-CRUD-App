package productcrudapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String initHandler()
	{
		System.out.println("initHandler is running.....");
		return "home";
	}

}
