package org.serratec.backend.ecommerce.repositorios;

import java.util.Optional;

import org.serratec.backend.ecommerce.entidades.Cliente;
import org.serratec.backend.ecommerce.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	@Query("select C from Cliente C where C.cpf =:cpf")
	Optional<Cliente> findByCPF(@Param("cpf") String cpf);
	
	
}
