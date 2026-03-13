package br.upf.ccc.App02.model;

public class Conta {
    // Aqui definimos os atributos
    private Integer numero;
    private String titular;
    private Float saldo; // privamos o saldo para que ele não possa ser acessado diretamente de fora da classe, 
                        // garantindo o encapsulamento, ou seja, o controle sobre como o saldo é modificado, 
                        // forçando o uso dos métodos depositar, sacar e transferir para alterar o saldo, evitando 
                        // que ele seja modificado de forma inadequada.

    // Aqui definimos os construtores
    public Conta() {
        saldo = 0.0f;
    }
    
    // definir um construtor que recebe o número e o titular
    public Conta(Integer numero, String titular) {
        //this.numero = numero;
        setNumero(numero);
        this.titular = titular;
        saldo = 0.0f;
    }

    public Conta(Integer numero) {
        //this.numero = numero;
        setNumero(numero);
        saldo = 0.0f;
    }

    // Aqui definimos os métodos
    public void depositar(Float valor){
        saldo += valor;
    }

    public void sacar(Float valor){
        saldo -= valor;
    }

    public void transferir(Float valor, Conta destino){
        saldo -= valor; // tirar da origem
        destino.saldo += valor; // colocar no destino
    }

    // Aqui definimos os getters e setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if(numero <= 0){
            throw new IllegalArgumentException("O número da conta deve ser positivo.");
        } // validação para garantir que o número da conta seja positivo, evitando números inválidos.
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

}
