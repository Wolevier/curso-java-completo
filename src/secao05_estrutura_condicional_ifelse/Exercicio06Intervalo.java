package secao05_estrutura_condicional_ifelse;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio06Intervalo {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");

        double valor = sc.nextDouble();

        if (valor < 0.0 || valor > 100.0) {
            System.out.println("O valor inserido está fora do intervalo.");
        }else if (valor <= 25.0) {
            System.out.println("Esse valor está no intervalo [0,25]");
        }else if (valor <= 50.0) {
            System.out.println("Esse valor está no intervalo (25,50]");
        }else if (valor <= 75.0) {
            System.out.println("Esse valor está no intervalo (50,75]");
        }else {
            System.out.println("Esse valor está no intervalo (75,100]");
        }

        sc.close();

    }
}


