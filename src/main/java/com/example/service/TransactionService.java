package com.example.service;

import java.util.List;

import com.example.model.Transactions;
import com.example.model.TransactionsVo;

public interface TransactionService {

	Transactions createTransactions(Transactions transaction);
	List<Transactions> getAllTransactions();
	Transactions getTransactionsById(long transactionsid);
	Transactions reverseTransaction(long transactionid);
	
}
