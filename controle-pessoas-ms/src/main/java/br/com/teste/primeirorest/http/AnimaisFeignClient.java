package br.com.teste.primeirorest.http;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.teste.primeirorest.shared.AnimalDTO;

@FeignClient(name = "controle-animais-ms")
public interface AnimaisFeignClient {
    @GetMapping( path = "/api/animais/{dono}/lista" )
    List<AnimalDTO> obterAnimais(@PathVariable Integer dono);
}
