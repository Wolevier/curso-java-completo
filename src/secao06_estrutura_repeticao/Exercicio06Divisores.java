package secao06_estrutura_repeticao;
import java.util.Scanner;

//Exercicio: Ler um número inteiro N e calcular todos os seus divisores.

public class Exercicio06Divisores {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero inteiro para saber seus divisores: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                // NOTA 10: Começa direto com a variável, sem o "" no início
                System.out.println(i + " é divisor de " + numero);
            }
        }
        sc.close();
    }
}
