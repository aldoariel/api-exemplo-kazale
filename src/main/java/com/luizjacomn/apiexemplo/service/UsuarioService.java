package com.luizjacomn.apiexemplo.service;

import java.util.Optional;

import com.luizjacomn.apiexemplo.model.Usuario;

public interface UsuarioService {

	Optional<Usuario> buscarPorEmail(String email);

}