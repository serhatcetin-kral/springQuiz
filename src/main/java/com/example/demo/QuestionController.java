package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Questions>> getAllQuestion(){
		
		return questionService.getAllQuestion();
		
	
	}
	
	@GetMapping("catagory/{catagory}")
	public ResponseEntity<List<Questions>> getQuestionByCatagory(@PathVariable String catagory){
		return (ResponseEntity<List<Questions>>) questionService.getQuestionsByCatagory(catagory);
		
	}
	
	@PostMapping("add")
	public ResponseEntity<String>  addQuestion(@RequestBody Questions question) {
		return questionService.addQuestion(question);
	}
	
}

	
