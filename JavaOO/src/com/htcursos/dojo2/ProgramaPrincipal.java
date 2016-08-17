package com.htcursos.dojo2;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		GerenciadorRegistroCliente gr = new GerenciadorRegistroCliente();

		Cidade cg = new Cidade();
		cg.setNome("cg");
		Cliente cliExcluir = null;

		int sair = 0;
		do {

			System.out.println("Informe opção");
			int opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				Cliente cli = new Cliente();
				System.out.println("Informe o id:");
				cli.setId(leitor.nextInt());
				System.out.println("nome");
				cli.setNome(leitor.next());
				System.out.println("rg");
				cli.setRg(leitor.next());
				cli.setCidade(cg);
				System.out.println("Sexo");
				cli.setSexo(leitor.next().charAt(0));
				cliExcluir = cli;
				gr.salvar(cli);

				break;
			case 2:

				gr.excluir(cliExcluir);
				break;
			case 3:
				System.out.println("Lista de homens:");
				for (Cliente cliente : gr.getListaHomens()) {
					System.out.println(cliente);
				}
				break;
			case 4:
				System.out.println("Lista de mulheres:");
				for (Cliente cliente : gr.getListaMulheres()) {
					System.out.println(cliente);
				}
				break;
			case 5:
				System.out.println("Lista de moradores de " + cg);
				for (Cliente cliente : gr.getListaCidade(cg)) {
					System.out.println(cliente);
				}
				break;
			case 6:
				System.out.println("Busca de Clientes ");
				System.out.println(gr.pesquisar(cliExcluir).getId());
				break;
			case 7:
				gr.imprimirTodos();
				break;

			default:
				System.out.println("Opção invalida");
				break;

			}
			System.out.println("Deseja continuar? 1-sim 2-nao");
			sair = leitor.nextInt();

		} while (sair == 1);
	}

}
