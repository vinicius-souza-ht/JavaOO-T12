package com.htcursos.dojo2;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorRegistroCliente extends GerenciadorRegistroGenerico<Cliente> {

	public List<Cliente> getListaHomens() {
		List<Cliente> cliHomens = new ArrayList<>();

		for (Cliente cliente : list) {
			if (cliente.getSexo() == 'm' || cliente.getSexo() == 'M') {
				cliHomens.add(cliente);
			}
		}

		return cliHomens;
	}

	public List<Cliente> getListaMulheres() {

		List<Cliente> cliMulher = new ArrayList<>();

		for (Cliente cliente : list) {
			if (cliente.getSexo() == 'f' || cliente.getSexo() == 'F') {
				cliMulher.add(cliente);
			}
		}

		return cliMulher;
	}

	public List<Cliente> getListaCidade(Cidade cidade) {
		List<Cliente> cliResult = new ArrayList<>();
		for (Cliente cliente : list) {
			if (cliente.getCidade().equals(cidade)) {
				cliResult.add(cliente);
			}
		}
		return cliResult;
	}
}
