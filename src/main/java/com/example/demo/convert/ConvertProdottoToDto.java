package com.example.demo.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.ProdottoDTO;
import com.example.demo.model.entity.Prodotto;

@Component
public class ConvertProdottoToDto {

	public ProdottoDTO prodottoconv(Prodotto prodotto) {

		ProdottoDTO prodottoDTO = new ProdottoDTO();
		prodottoDTO.setNome_prodotto(prodotto.getNome_prodotto());
		prodottoDTO.setCategoria_prodotto(prodotto.getCategoria_prodotto());
		prodottoDTO.setPrezzo(prodotto.getPrezzo());

		return prodottoDTO;

	}

	public List<ProdottoDTO> prodottolistadto(List<Prodotto> prodotti) {

		List<ProdottoDTO> listaprodottidto = new ArrayList<ProdottoDTO>();

		for (int i = 0; i < prodotti.size(); i++) {
			listaprodottidto.add(prodottoconv(prodotti.get(i)));

		}

		return listaprodottidto;
	}

}
