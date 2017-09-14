package com.luizjacomn.apiexemplo.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Criptografia {
	/**
	 * Gera um hash utilizando o BCrypt.
	 * @param senha
	 * @return String
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null)
			return null;
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		return bCrypt.encode(senha);
	}

	/**
	 * Verifica se a senha é válida.
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean ​
	 */
	public static boolean isSenhaValida(String senha, String senhaEncoded​) {
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		return bCrypt.matches(senha, senhaEncoded​);
	}
}