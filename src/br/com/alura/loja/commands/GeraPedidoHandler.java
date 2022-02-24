package br.com.alura.loja.commands;

import br.com.alura.loja.email.GeraEmail;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.Pedido;
import org.apache.groovy.groovysh.Command;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class GeraPedidoHandler extends CommandHandler<GeraPedido>{

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acaoProxima.setPedido(pedido);
        this.proximoHandler.executa(acaoProxima);
    }
}

