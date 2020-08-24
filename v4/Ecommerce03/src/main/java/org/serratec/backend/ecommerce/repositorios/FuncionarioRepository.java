package org.serratec.backend.ecommerce.repositorios;

import org.serratec.backend.ecommerce.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{}

