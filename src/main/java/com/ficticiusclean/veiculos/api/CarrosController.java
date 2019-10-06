package com.ficticiusclean.veiculos.api;

import com.ficticiusclean.veiculos.domain.Carro;
import com.ficticiusclean.veiculos.domain.CarroService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
	@Autowired //não precisa mais dar o new, pois o Spring cria automaticamente através do @Autowired
	private CarroService service;
	
	@GetMapping()
	public Iterable<Carro> get() {
		return service.getCarros();
	}
	
	@GetMapping("/{ID}")
	public Optional<Carro> get(@PathVariable("ID") Long ID){
		return service.getCarroByID(ID);
	}
	
	@GetMapping("/modelo/{modelo}")
	public Iterable<Carro> getCarrosByModelo(@PathVariable("modelo") String modelo){
		return service.getCarrosByModelo(modelo);
	}
	
	@PostMapping
	//adicionando um carro no cadastro
	public String post(@RequestBody Carro carro) {
		Carro c = service.savecar(carro);
		
		return "Carro salvo com sucesso!" + c.getID();
	}
	
	

}
