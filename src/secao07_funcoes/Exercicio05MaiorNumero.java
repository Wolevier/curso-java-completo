package secao07_funcoes;
import java.util.Scanner;

public class Exercicio05MaiorNumero {
    public static void main(String[] args) {
        String continuarApp = "n";
        Scanner input = new Scanner(System.in);

        while (!continuarApp.equalsIgnoreCase("s")) {
            System.out.print("Insira o primeiro número: ");
            int primeiroNumero = input.nextInt();
            System.out.print("Insira o segundo número: ");
            int segundoNumero = input.nextInt();
            int resultado = definirMaiorNumero(primeiroNumero, segundoNumero);
            exibirResultado(resultado);

            System.out.print("Deseja continuar? insira 's' para sim: ");
            input.nextLine();
            continuarApp = input.nextLine();
            }
            input.close();
            System.out.println("Programa encerrado!\n");
        }
        public static int definirMaiorNumero ( int primNumero, int segunNumero){
            if (primNumero > segunNumero) {
                return primNumero;
            }
            return segunNumero;
        }
        public static void exibirResultado ( int resultado){
            System.out.println("O maior número inserido é: " + resultado);
        }
}
