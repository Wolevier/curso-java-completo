package secao05_estrutura_condicional_ifelse;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio05ContaAPagar {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("INSIRA O CÓDIGO DO ITEM E A QUANTIDADE:");
        int codigoItem = sc.nextInt();
        int quantidadeItem = sc.nextInt();

        System.out.printf("""
                CÓDIGO      ESPECIFICAÇÃO       TOTAL
                ----------------------------------------
                """);

        if(codigoItem == 1)
        {
            System.out.printf("""
                   %d        Cachorro Quente     R$ %.2f
                ----------------------------------------
                """,codigoItem, quantidadeItem * 4.00);
        }
        else if (codigoItem == 2)
        {
            System.out.printf("""
                   %d        X-Salada            R$ %.2f
                ----------------------------------------
                """,codigoItem, quantidadeItem * 4.50);
        }
        else if (codigoItem == 3)
        {
            System.out.printf("""
                   %d        X-Bacon             R$ %.2f
                ----------------------------------------
                """,codigoItem, quantidadeItem * 5.00);
        }
        else if (codigoItem == 4)
        {
            System.out.printf("""
                   %d        Torrada Simples     R$ %.2f
                ----------------------------------------
                """,codigoItem, quantidadeItem * 2.00);
        }
        else if (codigoItem == 5)
        {
            System.out.printf("""
                   %d        Refrigerante        R$ %.2f
                ----------------------------------------
                """,codigoItem, quantidadeItem * 1.50);
        }
        else
        {
            System.out.println("          CÓDIGO INVÁLIDO!");
        }

    sc.close();

    }
}
