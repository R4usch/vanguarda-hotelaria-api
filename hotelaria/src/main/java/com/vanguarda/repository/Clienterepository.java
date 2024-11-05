package com.vanguarda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vanguarda.entity.Cliente;

import org.springframework.stereotype.Repository;

@Repository
public interface Clienterepository extends JpaRepository<Cliente, String> {
}