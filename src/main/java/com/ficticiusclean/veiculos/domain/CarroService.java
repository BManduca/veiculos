package com.ficticiusclean.veiculos.domain;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //transformando a class CarroService em um bin gerenciavel pelo Spring
public class CarroService {
	
	@Autowired
	private CarroRepository rep;
	
	public Iterable<Carro> getCarros(){
		return rep.findAll();
	}

	public Optional<Carro> getCarroByID(Long ID) {
		return rep.findById(ID);
	}

	public Iterable<Carro> getCarrosByModelo(String modelo) {
		return rep.findByModelo(modelo);
	}

	public Carro savecar(Carro carro) {
		return rep.save(carro);
		
	}

}
