package com.example.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.DaoRepository;
import com.example.exception.ResourceNotFoundException;
import com.example.model.Transactions;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService  {

	@Autowired
	private DaoRepository DaoRepository;
	
	@Override
	public Transactions createTransactions(Transactions transaction) {
		Optional<Transactions> senderDb=this.DaoRepository.findById(transaction.getSenderid());
		
        if(senderDb.isPresent()) {
       	 Transactions sendersDb=senderDb.get();
       //	MathContext mc = new MathContext(2);
       	BigDecimal senderTotalAmount=sendersDb.getTotalAmount();
       	senderTotalAmount=senderTotalAmount.subtract(transaction.getAmount());
      //for Senders data
       	sendersDb.setId(sendersDb.getId());
   		sendersDb.setAmount(transaction.getAmount());
   		sendersDb.setTotalAmount(senderTotalAmount);
   		sendersDb.setDetails(sendersDb.getDetails());
   	//	sendersDb.setCustomer(sendersDb.getCustomer());
   		//sendersDb.setSenderid(transaction.getId());
   		//for new transaction
   		transaction.setTotalAmount(transaction.getAmount());
   	//	transaction.setCustomer(transaction.getSenderid());
          		
       		DaoRepository.saveAndFlush(sendersDb);
       		DaoRepository.save(transaction);
       		return transaction;
   }
       	 else {
       		 throw new ResourceNotFoundException("Record not found for sender"+transaction.getSenderid());
       	 }
	}

	@Override
	public List<Transactions> getAllTransactions() {
		
		return this.DaoRepository.findAll();
	}

	@Override
	public Transactions getTransactionsById(long transactionsid) {
		Optional <Transactions> transaction=this.DaoRepository.findById(transactionsid);
		if(transaction.isPresent()) {
			
			return transaction.get();
		}
		else {
			throw new ResourceNotFoundException("No Record found by Id"+transactionsid);
		}
		
				
	}

	@Override
	public Transactions reverseTransaction(long transactionid) {
		Optional<Transactions> transactionDb=this.DaoRepository.findById(transactionid);
		
         if(transactionDb.isPresent()) {
        	 Transactions recieverDb=transactionDb.get();
         
        	 Optional<Transactions> senderDb=this.DaoRepository.findById(recieverDb.getSenderid());
        	 if(senderDb.isPresent()) {
        		Transactions sendersDb=senderDb.get();
        	//	MathContext mc = new MathContext(2); 
        		BigDecimal senderTotalAmount=sendersDb.getTotalAmount();
        		BigDecimal recieverAmount=recieverDb.getAmount();
        		BigDecimal recieverTotalAmount=recieverDb.getAmount();
        		senderTotalAmount=senderTotalAmount.add(recieverAmount);
        		recieverTotalAmount=recieverTotalAmount.subtract(recieverAmount);
        		//for senders data
        		sendersDb.setAmount(recieverAmount);
        		sendersDb.setTotalAmount(senderTotalAmount);
        		sendersDb.setDetails(sendersDb.getDetails());
        	//	sendersDb.setCustomer(sendersDb.getCustomer());
        		sendersDb.setSenderid(sendersDb.getSenderid());
        		// for recievers data
        		recieverDb.setAmount(recieverAmount);
        		recieverDb.setTotalAmount(recieverTotalAmount);
        		recieverDb.setDetails(sendersDb.getDetails());
        		//recieverDb.setCustomer(sendersDb.getCustomer());
        		recieverDb.setSenderid(sendersDb.getSenderid());
        		
        		DaoRepository.save(sendersDb);
        		DaoRepository.save(recieverDb);
        		return recieverDb;
    }
        	 else {
        		 throw new ResourceNotFoundException("Record not found for sender"+recieverDb.getSenderid());
        	 }

	}
         else {
        	 throw new ResourceNotFoundException("Record not found for Transaction ID"+transactionid);
         }
	}

}
