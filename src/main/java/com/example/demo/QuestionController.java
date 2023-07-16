package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("text")
	public String getText() {
		
		return "this text for get mothod";
		}
	
	
	@GetMapping("allQuestion")
	public List<Questions> getAllQuestion(){
		
		return questionService.getAllQuestion();
		
	
	}
	
	@GetMapping("catagory/{catagory}")
	public List<Questions> getQuestionByCatagory(@PathVariable String catagory){
		return questionService.getQuestionsByCatagory(catagory);
		
	}
	
	@PostMapping("add")
	public Questions addQuestion(@RequestBody Questions question) {
		return questionService.addQuestion(question);
	}
	
}

	
