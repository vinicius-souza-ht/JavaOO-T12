package com.htcursos.aula05;

import java.util.Arrays;
import java.util.Date;

public class PedidoImpl implements Pedido{

	private Integer codigo;
	private Date data;
	private Cliente cliente;
	private ItemPedido itens[] = new ItemPedido[3];
	private int posicao = 0;
	
	@Override
	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public Double calcularValorTotal() {
		Double total = 0d;
		
		for (int i = 0; i < itens.length; i++) {
			total = total + itens[i].getValor();
		}
		
		return total;
	}

	@Override
	public void adicionarItem(ItemPedido itemPedido) {
		
		if(posicao < itens.length){
			itens[posicao] = itemPedido;
			posicao++;
		}
	}

	@Override
	public void removerItemPedido(ItemPedido itemPedido) {
		for (int i = 0; i < itens.length; i++) {
			if(itemPedido.equals(itens[i])){
				Livro livro = new Livro();
				livro.setCodigo(11);
				livro.setDescricao("Vazio");
				livro.setValor(0d);
				itens[i] = livro;
			}
		}
		
	}

	@Override
	public void imprimirItens() {
		for(int i = 0; i < itens.length; i++){
			System.out.println(itens[i]);
		}
		
	}

	@Override
	public ItemPedido[] ordenarItensPedidos() {
		Arrays.sort(itens);
		
		System.out.println("ORDENADO");
//		for (int i = 0; i < itens.length; i++) {
//			itens[i].getDescricao();
//		}
		return itens;
	}

	@Override
	public ItemPedido[] getItensPedidos() {
		return itens;
	}

}
