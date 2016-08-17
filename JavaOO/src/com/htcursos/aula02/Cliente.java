package com.htcursos.aula02;

public class Cliente extends PessoaFisica{
	
	public int idade;

	public Cliente(String nome, Cidade cidade, String cpf, String rg, int idade) {
		super(nome, cidade, cpf, rg);
		this.idade = idade;
	}
	


	
	
	
	
}
