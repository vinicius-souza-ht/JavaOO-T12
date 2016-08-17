package com.htcursos.aula03;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		String cpf = "";
		
		if(ValidacaoUtil.validarCpf(cpf)){
			System.out.println("CPF Válido");
		} else {
			System.out.println("CPF Inválido.");
		}
		
		System.out.println("PI: " + ValidacaoUtil.PI);
	}
}
