package org.serratec.backend.ecommerce.repositorios;

import org.serratec.backend.ecommerce.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>  {}

