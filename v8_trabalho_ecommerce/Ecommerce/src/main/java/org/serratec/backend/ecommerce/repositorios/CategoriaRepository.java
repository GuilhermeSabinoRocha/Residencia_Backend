package org.serratec.backend.ecommerce.repositorios;

import org.serratec.backend.ecommerce.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{}

