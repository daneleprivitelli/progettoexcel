package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Prodotto;

public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {

	
}
