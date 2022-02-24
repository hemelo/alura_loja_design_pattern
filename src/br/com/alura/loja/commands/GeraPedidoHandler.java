package br.com.alura.loja.commands;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.commands.actions.GeraPedido;
import br.com.alura.loja.pedido.Pedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler extends CommandHandler<GeraPedido>{

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento(), dados.getQuantidadeItens()));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acaoProxima.setPedido(pedido);
        this.proximoHandler.executa(acaoProxima);
    }
}

