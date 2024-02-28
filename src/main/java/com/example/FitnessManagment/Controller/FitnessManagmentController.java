package com.example.FitnessManagment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FitnessManagment.Model.Fitness;
import com.example.FitnessManagment.Repository.FitnessloginReository;

@Controller
public class FitnessManagmentController {
	
	@Autowired
	FitnessloginReository fitnessrepo;

	@GetMapping("/homePage")
	public String gethomepage() {
		return "index";
	}

	@GetMapping("/LoginGym")
	public String getlogin() {
		return "login";
	}

	@GetMapping("/Registration")
	public String getregister() {
		return "register";
	}

	@PostMapping("/Details")
	public String getDetails(@ModelAttribute Fitness Member) {
		System.out.println(Member);
		fitnessrepo.save(Member);
		return "Response";
	}

	@RequestMapping("/del/{emailID}")
	public String delmember(@PathVariable String emailID) // for deleting records
	{
		fitnessrepo.deleteById(emailID);
		System.out.println("deleted");
		return "login";
	}

	

	@GetMapping("/Get")
	public List<Fitness> getValue() {
		System.out.println(fitnessrepo.findAll()); // it will print info on consol
		return fitnessrepo.findAll();
	}

	@GetMapping("/Show")
	public List<Fitness> showValue() {
		System.out.println(fitnessrepo.findAll()); // it will print info on consol
		return fitnessrepo.findAll();
	}

}
