package br.com.alura.loja;

import br.com.alura.loja.commands.EnviarEmailPedido;
import br.com.alura.loja.commands.GeraPedidoHandler;
import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.email.GeraEmail;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestesPedidos {

	public static void main(String[] args) {
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.nextAcao(new EnviarEmailPedido(), new GeraEmail());

		GeraPedido pedido = new GeraPedido("Henrique", new BigDecimal(500.0), 12);

		handler.executa(pedido);


	}

}
