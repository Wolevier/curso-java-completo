package secao05_estrutura_condicional_ifelse;
import java.util.Scanner;

public class Exercicio04DuracaoDeJogo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracaoDeJogo;

        if(horaInicial < horaFinal){
            duracaoDeJogo = horaFinal - horaInicial;
        }
        else{
            duracaoDeJogo = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracaoDeJogo + " HORA(S)");

        sc.close();
    }
}
