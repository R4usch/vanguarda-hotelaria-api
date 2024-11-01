package com.vanguarda.repository;

import com.vanguarda.entity.Formulario; // Certifique-se de que este import está correto
import org.springframework.data.jpa.repository.JpaRepository;

public interface Formulariorepository extends JpaRepository<Formulario, Integer> {}