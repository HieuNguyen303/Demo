package com.hieunt.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hieunt.modal.Nation;
import com.hieunt.modal.Student;

import jakarta.servlet.ServletContext;
import jakarta.validation.Valid;

@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	ServletContext app;
	
	@GetMapping("form")
	public String showStudent(Model model) {
		
		Student st = new Student();
		model.addAttribute("student", st); //phair cos
		return "StudentForm";
	}
	
	@PostMapping("form")
	public String submitStudent(@Valid @ModelAttribute ("student") Student st,
			BindingResult result, //ngay sau modelAtt
			Model model) {
		
		
		if(result.hasErrors()) {
			model.addAttribute("message", "You should be changed errors, pls");
			return "StudentForm";
		}
		else model.addAttribute("message", "You great! Not error.");
		
		System.out.println(2);
		model.addAttribute("student",st);
		System.out.println(3);
		return "StudentResult"; // khong loi chuyen trang ResultStudent
		
	}
	
	@ModelAttribute("hobbies")
	public String[] hobbiesList() {
		return new String[] {"Sport","Music","Football","Dance" };
	}
	
	
	@ModelAttribute("fields")
	public Map<String,String> fieldList() {
		Map<String,String> map = new HashMap<String,String>();  // loi HashMap<> !
		map.put("MATH", "Mathematic");
		map.put("PHY", "Physical");
		map.put("INFO", "Informatic");
		map.put("WEB", "Web Design");
		return map;
	}
	
	@ModelAttribute("faculties")
	public List<String> getFaculties(){
	return Arrays.asList("CNTT", "DLNHKS", "QTDN");
	}
	@ModelAttribute("nations")
	public List<Nation> nationsList() {
		List<Nation> nl = new ArrayList<Nation>();
		nl.add(new Nation("en","England"));
		nl.add(new Nation("vn","Vietnam"));
		nl.add(new Nation("fr","France"));
		nl.add(new Nation("cn","China"));
		return nl;
	}
}
