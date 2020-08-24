package org.serratec.backend.ecommerce.repositorios;

import java.util.List;

import org.serratec.backend.ecommerce.entidades.Consultas.ProdutosPorCategoria;
import org.serratec.backend.ecommerce.entidades.Consultas.ProdutosPorFuncionario;
import org.serratec.backend.ecommerce.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>  {
	@Query("select c.nome as categoria, count(l) as total from Produto l join l.categoria c group by c.nome")
	List<ProdutosPorCategoria> contaProdutosPorCategoria();

	
	@Query("select P.nome from Produto P join L.autores A where A.nome=:nome")
	Produto findByNome(@Param("nome") String nome);

	
	//public Produto incluiProduto(Produto produto,Integer id);
	
	//@Query("select b.nome as funcionario, count(l) as total from Produto l join l.funcionario b group by b.nome")
	//List<ProdutosPorFuncionario> contaProdutosPorFuncionario();

}
