package com.ficticiusclean.veiculos.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CarroRepository extends CrudRepository<Carro, Long> {

	Iterable<Carro> findByModelo(String modelo);
	
	List<Carro> findAllOrderByCons_med_com_cidade();
	
	List<Carro> findAllOrderByCons_med_com_rodovia();
	
}


