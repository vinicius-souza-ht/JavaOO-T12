package com.htcursos.aula06;

public class Cliente{
	
	public Cliente(){}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
	

}
