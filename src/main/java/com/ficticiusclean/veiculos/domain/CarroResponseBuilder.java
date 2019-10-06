package com.ficticiusclean.veiculos.domain;

import java.math.BigDecimal;

public class CarroResponseBuilder {
	
	public CarroAutonomiaResponse create(Carro carro, BigDecimal valorGasolina) {
		CarroAutonomiaResponse response = new CarroAutonomiaResponse(carro.getID(), carro.getNome(), carro.getMarca(), carro.getModelo(), carro.getData_fabricacao(), carro.getConsMedCombCidade(), carro.getConsMedCombRodov());
		
		response.setID(carro.getID());
		response.setNome(carro.getNome());
		response.setMarca(carro.getMarca());
		response.setModelo(carro.getModelo());
		response.setData_fabricacao(carro.getData_fabricacao());
		response.setConsMedCombCidade(carro.getConsMedCombCidade());
		response.setConsMedCombRodov(carro.getConsMedCombRodov());
		
		response.setCustoGasolina(valorGasolina.multiply(carro.getConsMedCombCidade()));
		
		response.setCustoGasolina(valorGasolina.multiply(carro.getConsMedCombRodov()));
		
		return response;
	}
	
}
