import javax.swing.JOptionPane;

public class AppDesktop {

    public static void main(String[] args){
        Conta c = new Conta();
        c.saldo= 0f;
        String ler = JOptionPane.showInputDialog("Informe o número");
        c.numero = Integer.valueOf(ler);

        ler = JOptionPane.showInputDialog("Informe o nome");
        c.titular = ler;

        // vamos mostrar os dados da conta lida
        System.out.println("Conta lida");
        System.out.println(c.numero + " " + c.titular);
        JOptionPane.showMessageDialog(null, "Conta lida: "+c.numero+" "+c.titular);


    }
}
