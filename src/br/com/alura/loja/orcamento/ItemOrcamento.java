package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel{
    private BigDecimal valorUnitario;
    private int quantidade;

    public ItemOrcamento(BigDecimal valorUnitario, int quantidade) {
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valorUnitario.multiply(new BigDecimal(quantidade));
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
