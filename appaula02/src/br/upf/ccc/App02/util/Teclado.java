package br.upf.ccc.App02.util;

public class Teclado {

    /**
     *  Método para ler um número inteiro do console
     *  @param É A mensagem a ser exibida para o usuário
     *  @return o número inteiro lido
     */
    public static Integer lerInteger(String mensagem){
        System.out.print(mensagem);
        return Integer.parseInt(System.console().readLine());
    }

    public static Float lerFloat(String mensagem){
        System.out.print(mensagem);
        return Float.parseFloat(System.console().readLine());
    }


    public static String lerString(String mensagem){
        System.out.print(mensagem);
        return System.console().readLine();
    }
}
