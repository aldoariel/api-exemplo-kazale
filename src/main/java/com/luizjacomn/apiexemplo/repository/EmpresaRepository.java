package com.luizjacomn.apiexemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizjacomn.apiexemplo.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findByCnpj(String cnpj);
}