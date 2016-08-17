package com.htcursos.aula01;

import java.util.Date;

import com.htcursos.aula02.Estado;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Date data = new Date(2016,8,10);
		
		Estado estado =  new Estado();
		estado.setNome("Mato Grosso do Sul");
		estado.setUF("MS");
		
		System.out.println(estado.toString());
		
		Cidade cidade = new Cidade();
		cidade.setNome("Campo Grande");
		cidade.setEstado(estado);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Jão da Silva");
		cliente.setRg("00000000");
		cliente.setCpf("00000000001");
		cliente.setCidade(cidade);
		
//		System.out.println("Cliente Nome: " + cliente.getNome());
//		System.out.println("Cliente RG: " + cliente.getRg());
//		System.out.println("Cliente CPF: " + cliente.getCpf());
//		System.out.println("Cidade Nome: " + cliente.getCidade().getNome());
//		System.out.println("Estado Nome: " + cliente.getCidade().getEstado().getNome());
//		System.out.println("Estado UF: " + cliente.getCidade().getEstado().getUF());
		
		///////////////////////////////////////////////////////////
		Cidade cidade2 = new Cidade();
		cidade2.setNome("Dourados");
		cidade2.setEstado(estado);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria da Silva");
		cliente2.setRg("111111111");
		cliente2.setCpf("11111110");
		cliente2.setCidade(cidade2);
		
//		System.out.println("/////////////////////////////////////");
//		System.out.println("Cliente Nome: " + cliente2.getNome());
//		System.out.println("Cliente RG: " + cliente2.getRg());
//		System.out.println("Cliente CPF: " + cliente2.getCpf());
//		System.out.println("Cidade Nome: " + cliente2.getCidade().getNome());
//		System.out.println("Estado Nome: " + cliente2.getCidade().getEstado().getNome());
//		System.out.println("Estado UF: " + cliente2.getCidade().getEstado().getUF());
	}

}
