package secao05_estrutura_condicional_ifelse;

import java.util.Scanner;

public class Exercicio03Multiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
