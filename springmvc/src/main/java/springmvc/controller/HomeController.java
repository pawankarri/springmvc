package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String home(Model model)
{
	model.addAttribute("name", "pawan");
	model.addAttribute("id",12345);
		System.out.println("this is home url");
	return "index";
}
	@RequestMapping("/about")
	public String about(Model model)
	{
		List<String> l=new ArrayList();
		l.add("prasad");
		l.add("prasad");
		l.add("satya");
		model.addAttribute("f", l);
		System.out.println("you are in about page");
		return "about";
	}
	@RequestMapping("/service")
	public String services()
	{
		System.out.println("this is service page");
		return "services";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modview=new ModelAndView();
		modview.addObject("name","hyderabad");
		modview.addObject("pincode",500072);
		modview.setViewName("help");
		System.out.println("this is help page");
		return modview;
		
	}
}
