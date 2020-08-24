package trabalhoBackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabalhoBackend.entidades.CarrinhoDeCompras;

@Repository
public interface CarrinhoDeComprasRepository  extends JpaRepository<CarrinhoDeCompras, Integer>{

}
