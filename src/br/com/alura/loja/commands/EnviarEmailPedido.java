package br.com.alura.loja.commands;

import br.com.alura.loja.email.GeraEmail;

public class EnviarEmailPedido extends CommandHandler<GeraEmail>{
    public void executa(GeraEmail email){
        /* Fazer as coisas aqui que enviam um email */
        System.out.println("Email Enviado");
    }
}
