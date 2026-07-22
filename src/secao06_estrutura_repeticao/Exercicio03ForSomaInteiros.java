package secao06_estrutura_repeticao;
import java.util.Scanner;

/*
* Exercicio: Fazer um programa que lê um valor inteiro N e depois N números inteiros.
* Ao final, mostra a soma dos N números lidos.*/

public class Exercicio03ForSomaInteiros {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i, n;
        int resultado = 0;

        System.out.print("Insira a quantidade de parcelas da soma: ");
        n = sc.nextInt();

        for(i = 0; i < n; i++) {
            int parcelaSoma = 0;
            System.out.print("Insira um número inteiro: ");
            parcelaSoma = sc.nextInt();
            resultado += parcelaSoma;
        }
        System.out.println("Resultado: "+resultado);
        sc.close();
    }
}
