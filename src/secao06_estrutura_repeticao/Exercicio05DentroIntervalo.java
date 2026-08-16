package secao06_estrutura_repeticao;
import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "Dentro" para dentro do intervalo, e "Fora" para fora do intervalo)*/

public class Exercicio05DentroIntervalo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de valores a serem inseridos: ");
        int quantidadeValores = sc.nextInt();
        int in = 0, out = 0;

        for(int i = 0; i < quantidadeValores; i++){
            System.out.printf("Insira o valor %d: ",i+1);
            int leituraValor = sc.nextInt();

            if(leituraValor >= 10 && leituraValor <= 20){
                in += 1;
            }
            else{
                out += 1;
            }
        }
        System.out.println("Dentro: "+in+"\n"+"Fora: "+out);
        sc.close();
    }
}
