package com.hieunt.modal;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student2 {
	@NotBlank(message = "hjfdshasf")
	String name;
	
	@NotBlank(message = "{NotBlank.sv.email}")
	String email;
	
	@NotNull(message = "{NotBlank.sv.marks}")
	Double marks;
	
	@NotEmpty(message = "{NotBlank.sv.gender}")
	Boolean gender;
	
	@NotEmpty(message = "{NotBlank.sv.faculty}")
	String faculty;
	
	@NotEmpty(message = "{NotBlank.sv.hobbies}")
	List<String> hobbies;

}
