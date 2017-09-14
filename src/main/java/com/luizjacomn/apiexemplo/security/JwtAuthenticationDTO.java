package com.luizjacomn.apiexemplo.security;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class JwtAuthenticationDTO {
	
	private String email;
	private String senha;

	public JwtAuthenticationDTO() {
	}

	@NotBlank(message = "Email não pode ser vazio.")
	@Email(message = "Email inválido.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotBlank(message = "Senha não pode ser vazia.")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "JwtAuthenticationRequestDTO [email=" + email + ", senha=" + senha + "]";
	}

}