package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	
	public ResponseEntity<List<Questions>> getAllQuestion(){
		try {
		
		return new ResponseEntity<>(questionRepository.findAll(),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		}
	
	
	public ResponseEntity<List<Questions>> getQuestionsByCatagory(String catagory){
		try {return new ResponseEntity(questionRepository.findByCatagory(catagory),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity(questionRepository.findByCatagory(catagory),HttpStatus.BAD_REQUEST);
	}
	
	
	
	public ResponseEntity<String> addQuestion(Questions questions) {
		 questionRepository.save(questions);
		 return new ResponseEntity("question added succesfuly",HttpStatus.CREATED);
	}
	

}
