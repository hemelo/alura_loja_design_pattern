package br.com.alura.loja.commands.actions;

import br.com.alura.loja.pedido.Pedido;

public abstract class Action {
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
