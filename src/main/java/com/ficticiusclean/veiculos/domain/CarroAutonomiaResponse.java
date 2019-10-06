package com.ficticiusclean.veiculos.domain;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CarroAutonomiaResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String nome;
	
	private String marca;
	
	private String modelo;
	
	private Date data_fabricacao;
	
	private BigDecimal ConsMedCombCidade;
	
	private BigDecimal ConsMedCombRodov;
	
	
	public CarroAutonomiaResponse(Long ID, String nome, String marca, String modelo, Date data_fabricacao,
			BigDecimal ConsMedCombCidade, BigDecimal ConsMedCombRodov) {
		this.ID = ID;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.data_fabricacao = data_fabricacao;
		this.ConsMedCombCidade = ConsMedCombCidade;
		this.ConsMedCombRodov = ConsMedCombRodov;
	}
	
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(Date data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}

	public BigDecimal getConsMedCombCidade() {
		return ConsMedCombCidade;
	}

	public void setConsMedCombCidade(BigDecimal consMedCombCidade) {
		ConsMedCombCidade = consMedCombCidade;
	}

	public BigDecimal getConsMedCombRodov() {
		return ConsMedCombRodov;
	}

	public void setConsMedCombRodov(BigDecimal consMedCombRodov) {
		ConsMedCombRodov = consMedCombRodov;
	}


	public void setCustoGasolina(BigDecimal multiply) {
		// TODO Auto-generated method stub
		
	}

}
