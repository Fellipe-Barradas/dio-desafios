import entities.IphoneApplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IphoneApplication iphoneApplication = new IphoneApplication();
        Scanner input = new Scanner(System.in);

        iphoneApplication.inserirPreferencias(input);
        iphoneApplication.iniciarAplicacao(input);
    }

}