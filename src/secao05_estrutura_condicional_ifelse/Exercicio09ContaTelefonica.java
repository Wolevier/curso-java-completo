package secao05_estrutura_condicional_ifelse;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio09ContaTelefonica {

    public static final double PLANO_BASICO = 50.00; // O plano básico da direito a 100 minutos de telefonema.

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de minutos consumidos: ");
        int minutosConsumidos = sc.nextInt();
        double contaAPagar = PLANO_BASICO;

        if(minutosConsumidos > 100){
            contaAPagar = PLANO_BASICO + (minutosConsumidos - 100) * 2.00;
        }

        System.out.printf("Valor da conta: R$ %.2f",contaAPagar);

        sc.close();
    }
}
