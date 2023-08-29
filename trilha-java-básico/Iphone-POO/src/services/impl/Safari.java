package services.impl;

import services.Navegador;

public class Safari implements Navegador {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
