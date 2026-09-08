package secao07_funcoes;
import java.util.Scanner;

public class Exercicio06ContadorDeVogais {

    public static void main(String[] args) {
        String sairApp = "n";
        Scanner input = new Scanner(System.in);

        while(!sairApp.equalsIgnoreCase("s")){
        System.out.print("Insira um texto para saber a quantidade de vogais nele: ");
        String texto = input.nextLine().toLowerCase();
        int resultado = contarVogais(texto);
        mostrarResultado(resultado);

        System.out.print("\nPara sair, digite 's' ou qualquer outra tecla para continuar: ");
        sairApp = input.nextLine();
        }

        System.out.println("Aplicativo encerrado!");
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