package com.htcursos.dojo;

public class Refeicao implements Produto {

	private TipoProdutoEnum tipo;
	private double preco;

	public Refeicao(TipoProdutoEnum tipo, double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setTipo(TipoProdutoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public double getValor() {
		
		return preco;
	}

	@Override
	public TipoProdutoEnum getTipo() {
		
		return tipo;
	}

	@Override
	public String toString() {
		return "Refeição: "+this.getTipo() + " " + this.getValor();
	}

}
