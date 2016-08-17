package com.htcursos.aula02;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Cidade cidade = new Cidade();
		cidade.setNome("Campo Grande");
		
		Estado estado = new Estado();
		estado.setCidadeGenerico(cidade);
		
	}
}
