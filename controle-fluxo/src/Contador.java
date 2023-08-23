import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        receberNumerosEIniciarContagem();
    }

    static void receberNumerosEIniciarContagem(){
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int numeroInicial = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int numeroFinal = terminal.nextInt();

        iniciarContagem(numeroInicial, numeroFinal);
    }

    static void iniciarContagem(int numeroInicial, int numeroFinal){
        try {
            contar(numeroInicial, numeroFinal);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroInicial, int parametroFinal) throws ParametrosInvalidosException {
        if(parametroInicial > parametroFinal){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroFinal - parametroInicial;
        for(int j = 1; j <= contagem; j++){
            System.out.println("Imprimindo número " + j);
        }
    }
}