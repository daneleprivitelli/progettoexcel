package com.example.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "excel_prodotto") // dare il nome alla tabella
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_prodotto;

	@Column(name = "nome_prodotto")
	private String nome_prodotto;

	@Column(name = "categoria_prodotto")
	private String categoria_prodotto;

	@Column(name = "prezzo")
	private double prezzo;

	public Integer getId_prodotto() {
		return id_prodotto;
	}

	public void setId_prodotto(Integer id_prodotto) {
		this.id_prodotto = id_prodotto;
	}

	public String getNome_prodotto() {
		return nome_prodotto;
	}

	public void setNome_prodotto(String nome_prodotto) {
		this.nome_prodotto = nome_prodotto;
	}

	public String getCategoria_prodotto() {
		return categoria_prodotto;
	}

	public void setCategoria_prodotto(String categoria_prodotto) {
		this.categoria_prodotto = categoria_prodotto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
