package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.convert.ConvertProdottoToDto;
import com.example.demo.model.dto.ProdottoDTO;
import com.example.demo.model.entity.Prodotto;
import com.example.demo.repository.ProdottoRepository;


@Service
public class ProdottoServiceImpl implements ProdottoService{
	
	@Autowired
	ProdottoRepository prodottoRepository;
	
	@Autowired
	ConvertProdottoToDto convertProdottoToDto;
	
	@Override
	public ProdottoDTO findByIdDTO(Integer id) {
		Prodotto prodotto = prodottoRepository.findById(id).get();
		
		ProdottoDTO prodottodto = convertProdottoToDto.prodottoconv(prodotto);
		return prodottodto;
	}

	@Override
	public ProdottoDTO salvaProdotto(Prodotto prodotto) {
		
		prodottoRepository.save(prodotto);
		ProdottoDTO prodottodto = convertProdottoToDto.prodottoconv(prodotto);
		
		return prodottodto;
	}
	
	

}
