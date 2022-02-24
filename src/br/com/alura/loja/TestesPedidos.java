package br.com.alura.loja;

import br.com.alura.loja.commands.EnviarEmailHandler;
import br.com.alura.loja.commands.GeraPedidoHandler;
import br.com.alura.loja.commands.actions.GeraEmail;
import br.com.alura.loja.commands.actions.GeraPedido;

import java.math.BigDecimal;

public class TestesPedidos {

	public static void main(String[] args) {
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.nextAcao(new EnviarEmailHandler(), new GeraEmail());

		GeraPedido pedido = new GeraPedido("Henrique", new BigDecimal(500.0), 12);

		handler.executa(pedido);


	}

}
