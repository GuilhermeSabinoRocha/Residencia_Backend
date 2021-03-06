package trabalhoBackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabalhoBackend.entidades.Categoria;

@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {


}
