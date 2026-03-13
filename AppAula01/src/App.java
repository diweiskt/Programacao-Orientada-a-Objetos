public class App {
    public static void main(String[] args) throws Exception { 
        System.out.println("Banco Fictício");

        System.out.println("Criar uma conta com seus dados");
        Conta c1 = new Conta(); // isso é instanciar (criar)
        c1.numero = 1;
        c1.titular = "Diwei";
        c1.saldo = 0f;

        Conta c2= new Conta();
        c2.numero = 2;
        c2.titular = "Jose";
        c2.saldo = 0f;

        System.out.println("Movimentar a conta - deposito - saque");
        c1.depositar(1000f);
        c1.sacar(1000f);
        c1.transferir(2000f, c2);

        System.out.println("Mostrar o saldo da conta após movimentos");
        System.out.println("Saldo da conta 1: " + c1.saldo);
        System.out.println("Saldo da conta 2: " + c2.saldo);
        
    }
}