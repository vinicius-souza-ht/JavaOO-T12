package com.htcursos.aula02;

public class PessoaFisica extends Pessoa{
	public String cpf;
	public String rg;
	
	
	public PessoaFisica(String nome, Cidade cidade, String cpf, String rg){
		super(nome, cidade);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//Getter e Setter
//	public String getCpf() {
//		return cpf;
//	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
	
	public String getCpf(){
		return cpf;
	}
	

}
