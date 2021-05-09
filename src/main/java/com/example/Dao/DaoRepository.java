package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Transactions;


@Repository
public interface DaoRepository   extends JpaRepository<Transactions,Long>{

}
