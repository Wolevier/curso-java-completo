package secao05_estrutura_condicional;
import java.util.Scanner;

public class Exercicio11CondicionalTernaria_MaiorIdade {

    public static void main(String[] args){

        System.out.println("Insira seu ano de nascimento para classificar sua idade: ");
        Scanner sc = new Scanner(System.in);
        int anoNascimento = sc.nextInt();
        int idade = 2026 - anoNascimento;
        String classificacaoIdade = (idade >= 18) ? "maior de idade" : "menor de idade";

        System.out.printf("Sua idade é %d anos, você é %s%n", idade, classificacaoIdade);

        sc.close();
    }
}
