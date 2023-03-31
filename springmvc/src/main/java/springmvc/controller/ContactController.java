package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);

	
		/*
		 * model.addAttribute("email",userEmail); model.addAttribute("username",
		 * userName); model.addAttribute("password", userPassword);
		 */
		/* model.addAttribute("user", user); */
		return "success";
	}
}
/*
 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
 * handleForm(@RequestParam("email") String userEmail,@RequestParam("uname")
 * String userName,@RequestParam("password") String userPassword,Model model) {
 * User user=new User(); user.setEmail(userEmail); user.setUname(userName);
 * user.setPassword(userPassword); System.out.println(user);
 * 
 * System.out.println("user email:"+userEmail);
 * System.out.println("user name:"+userName);
 * System.out.println("user password:"+userPassword);
 * 
 * model.addAttribute("email",userEmail); model.addAttribute("username",
 * userName); model.addAttribute("password", userPassword);
 * 
 * model.addAttribute("user", user); return "success"; } }
 */
