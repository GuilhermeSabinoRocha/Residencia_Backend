package trabalhoBackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabalhoBackend.entidades.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
