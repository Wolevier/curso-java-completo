package secao06_estrutura_repeticao;
import java.util.Scanner;
import java.util.Locale;

/*
* Fazer um programa para ler uma temperatura em Celsius e  mostrar o equivalente em Fahrenheit. Perguntar se o usuário
* deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
* */
public class Exercicio07ConversorCelsiusParaFahrenheit {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char repetir;

        do{
            System.out.print("Insira a temperatura em Celsius para converter em Fahrenheit: ");
            double grausCelsius = sc.nextDouble();
            double tempFahrenheit = (grausCelsius * 1.8) + 32.0;

            System.out.println(grausCelsius + " graus Celsius é equivale a "+ tempFahrenheit + " graus Fahrenheit.");
            System.out.print("Deseja repetir a conversão? digite 's' = sim / 'n' = não: ");
            repetir = sc.next().charAt(0);

        }while(repetir == 's');

    sc.close();
    }
}
