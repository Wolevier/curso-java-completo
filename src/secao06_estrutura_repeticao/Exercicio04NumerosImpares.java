package secao06_estrutura_repeticao;
import java.util.Scanner;

/*Leia um valor inteiro, em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/

public class Exercicio04NumerosImpares {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um valor inteiro: ");
        int valor = sc.nextInt();

        // Se o valor for menor ou igual a zero, avisa o erro
        if(valor <= 0) {
            System.out.println("O valor inserido é inválido!");
        }
        // SE NÃO for inválido (ou seja, se for positivo), faz o loop de forma segura
        else {
            // Ajustado para i = 1 para não testar o zero à toa
            for(int i = 1; i <= valor; i++){
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
