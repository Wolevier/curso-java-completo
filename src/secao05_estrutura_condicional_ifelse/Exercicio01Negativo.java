package secao05_estrutura_condicional_ifelse;
import java.util.Scanner;

public class Exercicio01Negativo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;
        numero = sc.nextInt();

        if(numero < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
