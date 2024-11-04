package com.vanguarda.repository;

import org.springframework.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vanguarda.entity.Cliente;


public interface Clienterepository extends JpaRepository<Cliente, String> {
}