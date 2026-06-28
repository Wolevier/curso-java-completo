package secao05_estrutura_condicional_ifelse;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07Coordenadas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as coordenadas X e Y:");
        double coordenadaX = sc.nextDouble();
        double coordenadaY = sc.nextDouble();

        // 1. Validação da Origem
        if (coordenadaX == 0.0 && coordenadaY == 0.0) {
            System.out.println("Origem");
        }
        // 2. Validação dos Eixos (Se um for zero, está em cima da linha)
        else if (coordenadaX == 0.0) {
            System.out.println("Eixo Y");
        }
        // 3. Validação dos Quadrantes
        else if (coordenadaY == 0.0) {
            System.out.println("Eixo X");
        }
        else if (coordenadaX > 0.0 && coordenadaY > 0.0) {
            System.out.println("Q1");
        }
        else if (coordenadaX < 0.0 && coordenadaY > 0.0) {
            System.out.println("Q2");
        }
        else if (coordenadaX < 0.0 && coordenadaY < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
