package secao07_funcoes_para_string;
import java.util.Scanner;
import java.util.Locale;

// Exercício prático e independente de criação de uma calculadora de IMC para praticar o estudo de sintaxe de funções

public class Exercicio03CalculadoraIMC {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.of("pt", "BR"));
        System.out.println("CALCULADORA DE ÍNDICE DE MASSA CORPORAL(IMC)");
        System.out.print("Insira o seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Insira sua altura: ");
        double altura = sc.nextDouble();
        double imc = calcularIMC(peso, altura);
        mostrarIMC(imc);
        sc.close();
    }
    public static double calcularIMC(double peso, double altura){
        double indiceMassaCorporal = peso / (altura * altura);
        return indiceMassaCorporal;
    }
    public static void mostrarIMC(double imc){
        if(imc <= 18.5){
            System.out.printf("Seu IMC: %.2f = Magreza (abaixo do peso)\n",imc);
        }else if(imc <= 24.9){
            System.out.printf("Seu IMC: %.2f = Peso normal (adequado)\n",imc);
        }else if(imc <= 29.9){
            System.out.printf("Seu IMC: %.2f = Sobrepeso (excesso de peso)\n",imc);
        }else if(imc <= 39.9){
            System.out.printf("Seu IMC: %.2f = Obesidade\n",imc);
        }else{
            System.out.printf("Seu IMC: %.2f = Obesidade Grave\n",imc);
        }
    }

}
