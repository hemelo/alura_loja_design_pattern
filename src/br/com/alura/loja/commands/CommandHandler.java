package br.com.alura.loja.commands;

public abstract class CommandHandler<T extends Action> {
    protected CommandHandler proximoHandler;
    protected Action acaoProxima;

    public <T extends Action> void nextAcao(CommandHandler<T> proximoHandler,T acaoProxima) {
        this.proximoHandler = proximoHandler;
        this.acaoProxima = acaoProxima;
    }

    public abstract void executa(T dados);
}
