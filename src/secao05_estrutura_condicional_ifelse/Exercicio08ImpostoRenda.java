package secao05_estrutura_condicional_ifelse;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio08ImpostoRenda {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salário para calcular o imposto de renda:");
        double salario = sc.nextDouble();

        if (salario < 0.00) {
            System.out.println("O valor inserido é inválido!");
        }
        else if (salario <= 2000.00) {
            System.out.println("Valor isento de imposto de renda.");
        }
        else {
            double impostoRenda;

            if (salario <= 3000.00) {
                impostoRenda = (salario - 2000.0) * 0.08;
            }
            else if (salario <= 4500.00) {
                impostoRenda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            }
            else {
                impostoRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            }

            System.out.printf("O valor do imposto a pagar é: R$ %.2f%n", impostoRenda);
        }

        sc.close();
    }
}
