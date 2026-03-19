package br.upf.ccc.tde01.dominio;

public class Pessoa {

    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getIMC() {
        return peso / (altura * altura);
    }

    public String getCategoriaIMC() {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            return "Magreza 0";
        } else if (imc < 25) {
            return "Normal 0";
        } else if (imc < 30) {
            return "Sobrepeso I";
        } else if (imc < 40) {
            return "Obesidade II";
        } else {
            return "Obesidade Grave III";
        }
    }
}