package edu.vinicius.week2;
public class Calculadora {
    
    public static void main(String[] args) {
        double numeroUm = 8.6;
        double numeroDois = 4.6;

        double resultado = somar(numeroUm, numeroDois);

        System.out.println(resultado);
    }

    public static double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

}
