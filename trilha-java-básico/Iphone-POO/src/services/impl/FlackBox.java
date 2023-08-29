package services.impl;

import services.ReprodutorMusical;

public class FlackBox implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada...");;
    }
}
