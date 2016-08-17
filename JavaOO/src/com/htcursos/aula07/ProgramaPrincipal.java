package com.htcursos.aula07;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		String cpf = "905.098.531-90";
		try {
			ValidacaoUtil.validarCpf(cpf);
		} catch (RuntimeException | CPFInvalidException e) {
			if(e instanceof RuntimeException)
				cpf = "11111111111";
		}

		try {
			ValidacaoUtil.validarCpf(cpf);
		} catch (Throwable e) {
			System.out.println("SEGUNDO CATCH");
			e.printStackTrace();
		}
		System.out.println(cpf);
	}

}
