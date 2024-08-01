package com.hieunt.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hieunt.modal.Student;
import com.hieunt.modal.Student2;

import jakarta.validation.Valid;
@Controller
public class StudentController_2 {
	@RequestMapping("/student2/form2")
	public String form(@ModelAttribute("sv") Student2 sv) {
		return "/form2";
	}

	@PostMapping("/student2/save2")
	public String save(@Valid @ModelAttribute ("sv") Student st,
			BindingResult result, //ngay sau modelAtt
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("message", "You should be changed errors, pls");
		}
		else model.addAttribute("message", "You great! Not error.");
		return "/form2";
	}

	@ModelAttribute("genders")
	public Map<Boolean, String> getGenders() {
		Map<Boolean, String> map = new HashMap<>();
		map.put(true, "Male");
		map.put(false, "Female");
		return map;
	}

	@ModelAttribute("faculties")
	public List<String> getFaculties() {
		return Arrays.asList("CNTT", "DLNHKS", "QTDN");
	}

	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "Travelling");
		map.put("M", "Music");
		map.put("F", "Food");
		map.put("O", "Other");
		return map;
	}

}
