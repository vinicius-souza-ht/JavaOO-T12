package com.htcursos.dojo;

public class Cobranca {

	int indice = 0;
	// Produto[] produtos = new Produto[indice];
	// Integer qtd[] = new Integer[indice];
	Produto[] produtos;
	Integer[] qtd;

	public Cobranca(int i) {
		produtos = new Produto[i];
		qtd = new Integer[i];

	}

	public void adicionar(Produto almoco, int i) {

		if (indice < produtos.length) {

			produtos[indice] = almoco;
			qtd[indice] = i;
			indice++;
		} else
			System.out.println("Não tem espaço!!!");

	}

	public void imprimirRelatorio() {
		int totalQtd = 0;
		double totalValor = 0;
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i] + " Quantidade: " + qtd[i]);
			
			totalQtd = totalQtd + qtd[i];
			totalValor += (produtos[i].getValor()*qtd[i]); 
			
		}
		System.out.println("Valor total: " + totalValor);
		System.out.println("Quantidade total: " + totalQtd);
	}

}
