package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	
	public List<Questions> getAllQuestion(){
		
		return questionRepository.findAll();
		
	}
	
	public List<Questions> getQuestionsByCatagory(String catagory){
		
		return questionRepository.findByCatagory(catagory);
	}
	
	
	
	public Questions addQuestion(Questions questions) {
		return questionRepository.save(questions);
	}
	

}
