package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {
	private Imposto proximo;
	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public Imposto(Imposto proximo) {
		this.proximo = proximo;
	}

	public Imposto(){
		this.proximo = null;
	}

	public BigDecimal calcular(Orcamento orcamento){
		BigDecimal valorImposto = realizarCalculo(orcamento);
		if(proximo != null) { valorImposto.add(proximo.realizarCalculo(orcamento)); }
		return valorImposto;
	}

}
