package services.impl;

import services.AparelhoContato;

public class Contato implements AparelhoContato {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero + " ...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
