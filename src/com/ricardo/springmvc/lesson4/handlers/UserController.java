package com.ricardo.springmvc.lesson4.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ricardo.springmvc.lesson4.bean.User;


@Controller
public class UserController {
	
	@RequestMapping(value="user")
	public ModelAndView user(){
		return new ModelAndView("userform/user","command",new User());
	}
	
	
	@RequestMapping(value="addUser")
	public String addUser(@ModelAttribute("SpringWeb")User user,ModelMap model){
		model.addAttribute("username",user.getUsername());
		model.addAttribute("password", user.getPassword());
	      model.addAttribute("address", user.getAddress());
	      model.addAttribute("receivePaper", user.isReceivePaper());
	      model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
	      model.addAttribute("gender", user.getGender());
	      model.addAttribute("favoriteNumber", user.getFavoriteNumber());
	      model.addAttribute("country", user.getCountry());
	      model.addAttribute("skills", user.getSkills());
		return "userform/result";
	}
	
	@ModelAttribute("frameworks")
	public List<String> getFrameworks(){
		List<String> frameworks = new ArrayList<String>();
		frameworks.add("Spring MVC");
		frameworks.add("Struts 1");
		frameworks.add("Struts 2");
		frameworks.add("Apache Hadoop");
		return frameworks;
	}
	
	@ModelAttribute("numberList")
	public List<String> getNumberList(){
	      List<String> numbersList = new ArrayList<String>();
	      numbersList.add("1");
	      numbersList.add("2");
	      numbersList.add("3");
	      numbersList.add("4");
	      return numbersList;
	}
	 @ModelAttribute("countryList")
	   public Map<String, String> getCountryList()
	   {
	      Map<String, String> countryList = new HashMap<String, String>();
	      countryList.put("US", "United States");
	      countryList.put("CH", "China");
	      countryList.put("SG", "Singapore");
	      countryList.put("MY", "Malaysia");
	      return countryList;
	   }

	   @ModelAttribute("skillsList")
	   public Map<String, String> getSkillsList()
	   {
	      Map<String, String> skillList = new HashMap<String, String>();
	      skillList.put("Hibernate", "Hibernate");
	      skillList.put("Spring", "Spring");
	      skillList.put("Apache Hadoop", "Apache Hadoop");
	      skillList.put("Struts", "Struts");
	      return skillList;
	   }
	}
