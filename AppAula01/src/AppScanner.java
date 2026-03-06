import java.util.Scanner;

public class AppScanner {
    // Criar uma conta e ler o saldo
    public static void main(String[] args){
        Conta c = new Conta();
        // para ler os dados vamos iniciar um objeto Scanner de input
        Scanner ler = new Scanner(System.in);

        System.out.print("Numero: ");
        c.numero = ler.nextInt();

        System.out.println("Titular: ");
        c.titular = ler.next();

        c.saldo = 0f;

        ler.close();

        System.out.println("Conta lida");
        System.out.println(c.numero + " " + c.titular);
    }
}
