package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.Transaction;
import com.example.demo2.repository.TransactionRepository;

@RestController
@CrossOrigin
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionRepository repository;
	
	@PostMapping
	public Transaction addTransaction(@RequestBody Transaction t) {
		 return repository.save(t);
		
	}
	
	@GetMapping
	public List<Transaction> getAllTransaction(){
		return repository.findAll();
	}
	//This is my comment 5
	@DeleteMapping("/{id}")
	public void deleteTransaction(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
