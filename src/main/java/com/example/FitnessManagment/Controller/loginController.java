package com.example.FitnessManagment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FitnessManagment.Model.Fitness;
import com.example.FitnessManagment.Model.login;
import com.example.FitnessManagment.Repository.loginRepository;
//@RestController
@Controller
public class loginController {

	@Autowired
	loginRepository fitnessrepo;

//	@GetMapping("/Loginpage")
//	public String getlogin() {
//		return "login";
//	}
	@PostMapping("/log")
	public String loginpage(@ModelAttribute login logininfo) {
		fitnessrepo.save(logininfo);
		return"index";
	}
	@GetMapping("/signup")
	public String getSignupPage() {
		return "register";	
		}

//	@PostMapping("/signup")
//	public String signup(@ModelAttribute Fitness newMember) {
//		// Process signup data and save to repository
//		fitnessrepo.save(newMember);
//		return "redirect:/login"; // Redirect to login page after signup
//	}
	@RequestMapping("/dellogin/{email}")
	public String deleteValue(@PathVariable String email) {
		fitnessrepo.deleteById(email);
		System.out.println("deleted");
		return "login";
	}
	@PutMapping("/setValue/{email}/{password}")
	public String updatePassword(@PathVariable String email, @PathVariable String password) {
		login logininfo = fitnessrepo.findByEmail(email);

		if (logininfo != null) {
			logininfo.setPassword(password);
			fitnessrepo.save(logininfo);
			return "login";
		} else {
			return "error";
		}
	}

}
