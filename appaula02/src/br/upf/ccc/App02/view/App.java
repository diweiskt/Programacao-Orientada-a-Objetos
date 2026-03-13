package br.upf.ccc.App02.view;

import br.upf.ccc.App02.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        c1.setNumero(123);
        c1.setTitular("Joao");
        //c1.saldo = 1000.0f; //Não é possível acessar o saldo diretamente, pois ele é privado
        c1.depositar(1000f);

        // usando os construtores
        Conta c2 = new Conta(456, "Maria");
        c2.depositar(500f);

        Conta c3 = new Conta(789);
        c3.setTitular("Ana");
        c3.depositar(200f);
    }
}
