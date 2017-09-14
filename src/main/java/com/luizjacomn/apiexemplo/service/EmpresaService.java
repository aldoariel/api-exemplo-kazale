package com.luizjacomn.apiexemplo.service;

import java.util.Random;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

	public void testeServico() {
		System.out.println("Teste da " + this.getClass().getSimpleName());
	}

	@Cacheable("testeCache")
	public String testeCache() {
		Random random = new Random();
		return String.valueOf(random.nextInt(10));
	}
}