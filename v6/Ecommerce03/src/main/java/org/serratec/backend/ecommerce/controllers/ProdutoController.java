package org.serratec.backend.ecommerce.controllers;

import java.util.List; 

import javax.validation.Valid;

import org.serratec.backend.ecommerce.entidades.Consultas.ProdutosPorCategoria;
import org.serratec.backend.ecommerce.entidades.Produto;
import org.serratec.backend.ecommerce.exceptions.DataNotFoundException;
import org.serratec.backend.ecommerce.servicos.ProdutoService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> buscaTodos() {
		return produtoService.buscaTodos();
	}
	
	@GetMapping("/{id}")
	public Produto buscaPorId(@PathVariable Integer id) throws DataNotFoundException {
		return produtoService.buscaPorId(id);
	}
	
	@PostMapping("/{id}")
	public Produto inclui(@Valid @RequestBody Produto produto,@Valid @PathVariable Integer id) {
		return produtoService.incluiProduto(produto);
	}
	
	@PutMapping("/{id}")
	public Produto atualiza(@PathVariable Integer id, @Valid @RequestBody Produto produto) throws DataNotFoundException {
		return produtoService.atualizaProduto(id, produto);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity apaga(@PathVariable Integer id) throws DataNotFoundException {
		produtoService.apagaProduto(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/produtos-por-categoria")
	public List<ProdutosPorCategoria> produtosPorCategoria() {
		return produtoService.produtosPorCategoria();
	}
	
	/*
	@GetMapping("/produtos-por-funcionario")
	public List<ProdutosPorFuncionario> produtosPorFuncionario(){
		return produtoService.produtosPorFuncionario();
	}
	*/

}
