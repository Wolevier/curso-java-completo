package secao07_funcoes;
import java.util.Scanner;

public class Exercicio06ContadorDeVogais {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um texto para saber a quantidade de vogais nele: ");
        String texto = input.nextLine().toLowerCase();
        int resultado = contarVogais(texto);
        mostrarResultado(resultado);

        input.close();
    }

    public static int contarVogais(String texto){
        int cont = 0;
        for(int i = 0; i < texto.length(); i++){
            char palavra = texto.charAt(i);
            if(palavra == 'a'|| palavra == 'e' || palavra == 'i' || palavra == 'o' || palavra == 'u'){
                cont += 1;
            }
        }
        return cont;
    }
    public static void mostrarResultado(int resultado){
        System.out.printf("\nO texto inserido tem %d vogais.\n",resultado);
    }
}