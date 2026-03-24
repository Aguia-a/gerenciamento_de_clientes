package com.gerenciamento.clientes.repository;

import com.gerenciamento.clientes.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}