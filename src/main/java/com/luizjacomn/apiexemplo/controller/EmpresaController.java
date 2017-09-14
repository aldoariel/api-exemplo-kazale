package com.luizjacomn.apiexemplo.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizjacomn.apiexemplo.dto.EmpresaDTO;
import com.luizjacomn.apiexemplo.util.Response;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

	@GetMapping(value = "/{nome}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String teste(@PathVariable("nome") String nome) {
		return "Olá " + nome;
	}

	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@Valid @RequestBody EmpresaDTO dto, BindingResult result) {
		Response<EmpresaDTO> response = new Response<>();

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		dto.setId(1L);
		response.setData(dto);
		return ResponseEntity.ok(response);
	}
}