package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@GetMapping("/allQuestion")
	public String getAllQuestion(){
		return "all question";		
	}
}

	
