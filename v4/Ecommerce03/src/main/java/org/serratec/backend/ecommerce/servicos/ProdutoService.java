package org.serratec.backend.ecommerce.servicos;

import java.util.List; 
import java.util.Optional;

import javax.transaction.Transactional;

import org.serratec.backend.ecommerce.entidades.Consultas.ProdutosPorCategoria;
import org.serratec.backend.ecommerce.entidades.Consultas.ProdutosPorFuncionario;
import org.serratec.backend.ecommerce.entidades.*;
import org.serratec.backend.ecommerce.exceptions.DataNotFoundException;
import org.serratec.backend.ecommerce.repositorios.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	private Produto findById(Integer id) throws DataNotFoundException {
		Optional<Produto> produto = produtoRepository.findById(id);
		if (produto.isPresent()) {
			return produto.get();		
		}
		throw new DataNotFoundException(id);
	}
	
	public Produto buscaPorId(Integer id) throws DataNotFoundException {
		return findById(id);
	}
	
	public List<Produto> buscaTodos() {
		return produtoRepository.findAll();
	}
	
	@Transactional
	public abstract Produto incluiProduto(Produto produto,Integer id); {
		/*
		        Optional<Produto> optionalProduto = produtoRepository.findById(null);
		    	if (optionalLivroBanco.isPresent()) {
		    		Livro livroBanco = optionalLivroBanco.get();
		    		livroBanco.setTitulo(livro.getTitulo());
		    		return livroRepository.save(livro);
		    	}
		    	return livroRepository.save(livro);

		            //produtoBanco.setQuantidadeEstoque(produto.getQuantidadeEstoque());
		            
		        }

		 

		        return produtoService.incluiProduto(produto);
		
		
		//return produtoRepository.save(produto);
		 * */
	}
	
	@Transactional
	public Produto atualizaProduto(Integer id, Produto produto) throws DataNotFoundException { 
		Produto produtoBanco = findById(id);
		produtoBanco.setNome(produto.getNome());
		produtoBanco.setDescricao(produto.getDescricao());
		produtoBanco.setDataFabricacao(produto.getDataFabricacao());
		produtoBanco.setQuantidadeEstoque(produto.getQuantidadeEstoque());
		produtoBanco.setValorUnitario(produto.getValorUnitario());
		return produtoRepository.save(produtoBanco);
	}
	
	public void apagaProduto(Integer id) throws DataNotFoundException {
		Produto produto = findById(id);
		produtoRepository.delete(produto);
	}
	
	public List<ProdutosPorCategoria> produtosPorCategoria() {
		return produtoRepository.contaProdutosPorCategoria();
	}
	/*
	public List<ProdutosPorFuncionario> produtosPorFuncionario() {
		return produtoRepository.contaProdutosPorFuncionario();
	}
	*/

	
	
}
