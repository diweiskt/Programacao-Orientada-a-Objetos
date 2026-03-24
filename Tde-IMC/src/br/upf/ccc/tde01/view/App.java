package br.upf.ccc.tde01.view;

import br.upf.ccc.tde01.dominio.Pessoa;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {

        String ler = JOptionPane.showInputDialog("Digite a altura da pessoa (em metros): ");
        double altura = Double.parseDouble(ler);

        ler = JOptionPane.showInputDialog("Digite o peso da pessoa (em quilos): ");
        double peso = Double.parseDouble(ler);

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.getIMC();
        String imcFormatado = String.format("%.2f", imc);
        JOptionPane.showMessageDialog(null, "O IMC é: " + imcFormatado + "\nCategoria: " + pessoa.getCategoriaIMC());
    }

}