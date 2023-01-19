package edu.vinicius.week1;
public class Boletim {

    public static void main(String[] args) {
        String nome = "Vinicius";
        String mencao;
        double notaUm = 8.6;
        double notaDois = 2;
        double notaTres = 3;
        double notaQuatro = 3;

        double media = CalcularMedia(notaUm, notaDois, notaTres, notaQuatro);

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println(GerarMencao(media));
    }

    public static double CalcularMedia(double mediaUm, double mediaDois, double mediaTres, double mediaQuatro) {
        return (mediaUm + mediaDois + mediaTres + mediaQuatro) / 4;
    }

    public static String GerarMencao(double media) {
        if (media >= 7) {
            return "Parabéns! Você foi aprovado no Semestre.";
        } else if (media >= 5) {
            return "Você está de recuperação.";
        } else {
            return "Você foi reprovado.";
        }
    }
}
