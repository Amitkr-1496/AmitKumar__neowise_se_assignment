package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Dao.DaoRepository;
import com.example.model.Transactions;
import com.example.model.TransactionsVo;

@SpringBootApplication
public class TransactionsServiceApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(TransactionsServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
