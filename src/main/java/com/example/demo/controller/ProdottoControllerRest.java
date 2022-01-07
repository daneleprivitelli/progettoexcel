package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.ProdottoDTO;
import com.example.demo.model.entity.Prodotto;
import com.example.demo.service.ProdottoService;

@RestController
@RequestMapping("/api/prodotto")
public class ProdottoControllerRest {

	@Autowired 
	ProdottoService prodottoservice;
	
	@GetMapping(value= "/{id}")
	public ProdottoDTO getById(@PathVariable("id") Integer id) {
		return prodottoservice.findByIdDTO(id);
	}
	
	
	@PostMapping(value= "/save")
	public ProdottoDTO save(@RequestBody Prodotto prodotto) {
		return prodottoservice.salvaProdotto(prodotto);
	}
}
