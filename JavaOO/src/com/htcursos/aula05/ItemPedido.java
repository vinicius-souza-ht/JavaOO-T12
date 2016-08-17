package com.htcursos.aula05;

public interface ItemPedido  extends Comparable<ItemPedido>{
	
	public Integer getCodigo() ;
	public void setCodigo(Integer codigo);
	public Double getValor() ;
	public void setValor(Double valor);
	public String getDescricao() ;
	public void setDescricao(String descricao);

}
