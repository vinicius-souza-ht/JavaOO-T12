package com.htcursos.dojo;

public class Bebida implements Produto {

	private TipoProdutoEnum tipo;
	private double preco;

	public Bebida(TipoProdutoEnum tipo, double preco) {
		this.tipo = tipo;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Bebida: "+this.getTipo() + " " + this.getValor();
	}

}
