package com.ricardo.springmvc.lesson1.form.handlers;



import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ricardo.springmvc.lesson1.form.bean.Student;


@Controller
public class StudentController {
	

	
		 @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
		   public ModelAndView student(Model model) {
		      return new ModelAndView("form/addStudent", "command", new Student());
		   }

		  @ModelAttribute("student")
		   public Student createStudentModel() {    
		      return new Student();
		  }
		
		
		
		@RequestMapping(value="/addStudent",method = RequestMethod.POST)
		public String addStudent(@ModelAttribute("student")@Valid Student student,BindingResult result,Model model){
		
			if(result.hasErrors()){

				 return "form/addStudent";
			}
		
		
			model.addAttribute("name",student.getName());
			model.addAttribute("age", student.getAge());
			model.addAttribute("email",student.getEmail());
			model.addAttribute("id",student.getId());


			return "form/result";
		}
}
