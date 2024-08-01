package com.hieunt.modal;

import java.util.Date;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@NotBlank(message = "{NotBlank.student.name}")
//	@Pattern(regexp = "{A-Z a-z}", message = "Name must character !")
//	@Size(min=5, max=10, message = "Less than 10 && Longer than 5")
	private String name;
	
	@NotBlank(message = "{NotBlank.student.email}")
	@Email(message = "{Email.student.email}")
	private String email;
	
	@DecimalMin(value = "1", message = "DecimalMin.student.mark")
	@DecimalMax(value = "10", message = "DecimalMax.student.mark")
	@NotNull(message = "{NotNull.student.mark}")
	private Double mark;
	
	
	private Date birthdate;
	
	@NotNull(message = "{NotNull.student.gender}")
	private Boolean gender; 	// checkbox
	private Boolean married;	// radiobutton
	private String field;		// radiobuttons
	
	
	@NotBlank(message = "{NotBlank.student.faculty}")
	private String faculty;
	
	private String from;
	
	// select
	
	@NotEmpty(message = "NotEmpty.student.hobbies")
	private String[] hobbies;	// checkboxies
	
	
	
	
}
