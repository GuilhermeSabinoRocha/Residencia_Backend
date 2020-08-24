package org.serratec.backend.ecommerce.repositorios;

import org.serratec.backend.ecommerce.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {}
