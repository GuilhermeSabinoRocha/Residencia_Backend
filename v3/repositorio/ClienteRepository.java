package trabalhoBackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabalhoBackend.entidades.*;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
