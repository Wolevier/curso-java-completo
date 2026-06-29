package secao05_estrutura_condicional;
import java.util.Scanner;

public class Exercicio10DiaSemana {

    public static void main(String[] args){

        System.out.println("Insira um numero de 1 a 7 para saber o dia da semana:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        String diaDaSemana;

        switch (numero){
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana = "segunda-feira";
                break;
            case 3:
                diaDaSemana = "terça-feira";
                break;
            case 4:
                diaDaSemana = "quarta-feira";
                break;
            case 5:
                diaDaSemana = "quinta-feira";
                break;
            case 6:
                diaDaSemana = "sexta-feira";
                break;
            case 7:
                diaDaSemana = "sábado";
                break;
            default:
                diaDaSemana = "Número inválido!";
                break;

        }

        System.out.println("Dia da semana: "+diaDaSemana);

        sc.close();
    }
}
