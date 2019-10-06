package com.ficticiusclean.veiculos.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//essa propriedade a seguir transforma essa classe em um webservice rest
@RestController
@RequestMapping("/") // significa que estara mapeado na raiz da aplicação.
public class IndexController {

	@GetMapping // requisicao do tipo Get -> voltado para leitura de registro
	public String get() {
		return "API dos carros";
	}

	// ler os parametros a ser passados na função atraves do @RequestParam
	// para efetuar o mapeamento de caminhos especificos é utilizado o @PathVariable

}
