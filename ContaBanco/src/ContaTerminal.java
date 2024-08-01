import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da Agência!");
        int Numero = scanner.nextInt();

        System.out.println("Por favor digite sua Agência!");
        String Agencia = scanner.next();

        System.out.println("Por favor deigite seu nome!");
        String Nome = scanner.next();

        System.out.println("Por favor deigite seu saldo!");
        double Saldo = scanner.nextDouble();


        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponivel para saque.");
        
    }
}
