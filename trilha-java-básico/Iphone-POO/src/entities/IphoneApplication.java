package entities;

import services.AparelhoContato;
import services.Navegador;
import services.ReprodutorMusical;
import services.impl.*;

import java.util.Scanner;

public class IphoneApplication {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoContato aparelhoContato;
    private Navegador navegador;
    private boolean isClosed;

    public IphoneApplication() {
        this.isClosed = false;
    }

    public void inserirPreferencias(Scanner input) {
        System.out.println("""
                Iniciando Iphone!
                Primeiramente vamos fazer a configuração inicial.
                Como padrão de fabrica o 'Contatos' será a aplicão para realizar chamadas.
                """);
        aparelhoContato = new Contato();

        System.out.print("""
                Selecione o reprodutor musical
                1: ITunes
                2: FlackBox
                escolha:
                 """);
        int reprodutorMusicalNum = input.nextInt();

        System.out.print("""
                Selecione o reprodutor musical
                1: Safari
                2: Opera
                escolha:
                 """);
        int navegadorNum = input.nextInt();

        adicionarNavegadorConfiguracao(navegadorNum);
        adicionarReprodutorConfiguracao(reprodutorMusicalNum);

        System.out.println("Configuração completa!");
    }


    private void adicionarNavegadorConfiguracao(int navegadorNum) {
        switch (navegadorNum) {
            case 1 -> navegador = new Safari();
            case 2 -> navegador = new Opera();
        }
    }

    private void adicionarReprodutorConfiguracao(int reprodutorMusicalNum) {
        switch (reprodutorMusicalNum) {
            case 1 -> reprodutorMusical = new ITunes();
            case 2 -> reprodutorMusical = new FlackBox();
        }
    }

    public void iniciarAplicacao(Scanner input){
        while (!isClosed){
            System.out.print("""
                    Oque você deseja fazer?
                    1. Usar reprodutor musical
                    2. Usar aparelho de contato
                    3. Entrar no navegador
                    4. Fechar aplicação
                    
                    resposta:
                    """);
            int escolhaIteracao = input.nextInt();

            switch (escolhaIteracao){
                case 1 -> usarReprodutorMusical(input);
                case 2 -> usarAparelhoDeContato(input);
                case 3 -> entrarNavegador(input);
                case 4 -> fecharAplicacao();
            }
        }

    }

    public void fecharAplicacao(){
        System.out.println("Fechando aplicação...");
        isClosed = true;
    }

    public void usarReprodutorMusical(Scanner input){
        System.out.print("""
                    Oque você deseja fazer?
                    1. Tocar musica
                    2. Pausar musica
                    3. Selecionar Musica
                    
                    resposta:
                    """);
        int escolhaIteracao = input.nextInt();
        switch (escolhaIteracao){
            case 1 -> reprodutorMusical.tocar();
            case 2 -> reprodutorMusical.pausar();
            case 3 -> reprodutorMusical.selecionarMusica();
        }
    }

    public void usarAparelhoDeContato(Scanner input){
        System.out.print("""
                    Oque você deseja fazer?
                    1. Ligar
                    2. Atender
                    3. Iniciar correio de voz
                    
                    resposta:
                    """);
        int escolhaIteracao = input.nextInt();
        switch (escolhaIteracao){
            case 1 -> aparelhoContato.ligar("190");
            case 2 -> aparelhoContato.atender();
            case 3 -> aparelhoContato.iniciarCorreioDeVoz();
        }
    }

    public void entrarNavegador(Scanner input){
        System.out.print("""
                    Oque você deseja fazer?
                    1. Exibir página
                    2. Adicionar nova aba
                    3. Atualizar página
                    
                    resposta:
                    """);
        int escolhaIteracao = input.nextInt();
        switch (escolhaIteracao){
            case 1 -> navegador.exibirPagina("dio.me");
            case 2 -> navegador.adicionarNovaAba();
            case 3 -> navegador.atualizarPagina();
        }
    }


    @Override
    public String toString() {
        return "IphoneApplication{" +
                "reprodutorMusical=" + reprodutorMusical +
                ", aparelhoContato=" + aparelhoContato +
                ", navegador=" + navegador +
                '}';
    }
}
