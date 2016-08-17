package com.htcursos.aula07;

public class ValidacaoUtil {

	public static void validarCpf(String cpf) throws CPFInvalidException {
		if (cpf.length() != 11) {
			throw new CPFInvalidException();
		}
	}
}
