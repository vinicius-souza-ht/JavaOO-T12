package com.htcursos.dojo;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		// Montando o Cardárpio
		// Instanciando uma refeicao do tipo Almoco no valor de R$ 12,00
		Produto almoco = new Refeicao(TipoProdutoEnum.ALMOCO, 12.0);
		// Instanciando uma refeicao do tipo Marmita no valor de R$ 10,00
		Produto marmita = new Refeicao(TipoProdutoEnum.MARMITA, 10.0);
		// Instanciando uma Bebida do tipo SUCO no valor de R$ 5,00
		Produto suco = new Bebida(TipoProdutoEnum.SUCO, 5.0);
		// Instanciando uma Bebida do tipo REFRIGERANTE no valor de R$ 6,00
		Produto refrigerante = new Bebida(TipoProdutoEnum.REFRIGERANTE, 6.0);
	
		Produto almocoPromocional = new Produto() {
			@Override
			public double getValor() {
			return 8.0;
			}
			@Override
			public TipoProdutoEnum getTipo() {
			return TipoProdutoEnum.ALMOCO;
			}
			
			@Override
			public String toString(){
				return "Refeicao: "+getTipo()+" "+getValor();
			}
			
			};
			
			// Montando a Cobrança
			// Objeto de Cobranca, passando 5 posicoes a serem armazenadas
			Cobranca cobranca = new Cobranca(5);
			// Armazena em um vetor os itens da cobranca e em outro vetor a
			// quantidade
			cobranca.adicionar(almoco, 1);
			cobranca.adicionar(marmita, 2);
			cobranca.adicionar(suco, 1);
			cobranca.adicionar(refrigerante, 1);
			cobranca.adicionar(almocoPromocional, 2);
	
			cobranca.imprimirRelatorio();
	
	}
}
