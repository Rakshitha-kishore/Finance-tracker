package com.example.demo2.model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double amount;
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	private String category;
	private LocalDate date; 
	
	
	public Long getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public TransactionType getType() {
		return type;
	}
	
	public String getCategory() {
		return category;
	}
	
	public LocalDate getDate() {
		return date;
	}
}
