package com.htcursos.aula02;

public class Estado {
	private String nome;
	private String UF;
	private Cidade cidade;
	
	
	
	public void setCidadeGenerico(Object cidade){
		this.cidade = (Cidade)cidade;
	}
	
	//GETTER E SETTER
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	public String toString(){
		return nome + " " + UF;
	}
	
}
