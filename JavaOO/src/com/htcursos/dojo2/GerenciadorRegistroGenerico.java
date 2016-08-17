package com.htcursos.dojo2;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorRegistroGenerico<T> implements GerenciadorRegistro<T> {

	List<T> list = new ArrayList<T>();

	@Override
	public void salvar(T obj) {
		list.add(obj);
	}

	@Override
	public void excluir(T obj) {
		list.remove(obj);
	}

	@Override
	public T pesquisar(T obj) {
		
		if(list.indexOf(obj) == -1){
			return null;
		}
		
		else{
		 T pesquisa = (T) list.get(list.indexOf(obj));
			return  pesquisa;
		}
	}

	@Override
	public void imprimirTodos() {
		for (T object : list) {
			System.out.println("Impressao: " + object);
		}

	}

}
