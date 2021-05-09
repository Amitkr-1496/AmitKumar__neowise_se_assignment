package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Transactions;
import com.example.model.TransactionsVo;
import com.example.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	
	
	@GetMapping("/transactions")
	public ResponseEntity<List<Transactions>> getAllTransactions(){
		return ResponseEntity.ok().body(transactionService.getAllTransactions());
		}
	@PostMapping("/transactions")
	public ResponseEntity<Transactions> createTransaction(@RequestBody TransactionsVo transaction){
		Transactions transactions =new Transactions();
		transactions.setAmount(transaction.getAmount());
		transactions.setDetails(transaction.getDetails());
		transactions.setSenderid(transaction.getSender());
		
		return ResponseEntity.ok().body(transactionService.createTransactions(transactions));
		
	}
	
	@PutMapping("/transactions/{id}")
	public ResponseEntity<Transactions> reverseTransaction(@PathVariable long id){
		return ResponseEntity.ok().body(transactionService.reverseTransaction(id));
		}
	
	@GetMapping("/transactions/{id}")
	public ResponseEntity<Transactions> getTransaction(@PathVariable long id){
		return ResponseEntity.ok().body(transactionService.getTransactionsById(id));
		}
	

}
