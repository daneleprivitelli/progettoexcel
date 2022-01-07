package com.example.demo.service;

import com.example.demo.model.dto.ProdottoDTO;
import com.example.demo.model.entity.Prodotto;


public interface ProdottoService {
	
	ProdottoDTO findByIdDTO(Integer Id);
	
	ProdottoDTO salvaProdotto(Prodotto prodotto);
}
