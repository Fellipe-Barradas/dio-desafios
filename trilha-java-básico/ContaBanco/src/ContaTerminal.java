import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try {
            User user = getUserInformation();
            user.outputUserInformation();
        }catch (RuntimeException err){
            System.out.println(err.getMessage());
        }
    }

    private static User getUserInformation() {
        User client = new User();
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Por favor, digite o nome da agência: ");
            client.setAgencia(input.next());

            System.out.print("Por favor, digite o seu numero: ");
            client.setNumero(input.nextInt());

            System.out.print("Por favor, digite seu nome: ");
            client.setNomeCliente(input.next());

            System.out.print("Por favor, digite seu saldo: ");
            client.setSaldo(input.nextDouble());
            input.close();
            return client;
        }catch (InputMismatchException error){
            throw new RuntimeException("Erro, digite um valor válido no campo pedido.");
        }
    }
}