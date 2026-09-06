package secao07_funcoes;
import java.util.Scanner;

public class Exercicio04Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String desejaSair = "n";

        while(!desejaSair.equalsIgnoreCase(("s"))) {
                System.out.print("""
                         --------------------- CALCULADORA ---------------------
                        |                   Menu de operações                   |
                        |            1 - Adição                                 |
                        |            2 - Subtração                              |
                        |            3 - Multiplicação                          |
                        |            4 - Divisão                                |
                         -------------------------------------------------------
                        """);

                System.out.print("Insira a operação: ");
                int numeroOperacao = input.nextInt();
                System.out.print("Insira o primeiro valor: ");
                double primeiroValor = input.nextDouble();
                System.out.print("Insira o segundo valor: ");
                double segundoValor = input.nextDouble();
                input.nextLine();
                double resultado = 0;
                char simboloOperacao = ' ';
                boolean operacaoValida = true;


                switch (numeroOperacao) {
                    case 1:
                        simboloOperacao = '+';
                        resultado = calcularAdicao(primeiroValor, segundoValor);
                        break;
                    case 2:
                        simboloOperacao = '-';
                        resultado = calcularSubtracao(primeiroValor, segundoValor);
                        break;
                    case 3:
                        simboloOperacao = '*';
                        resultado = calcularMultiplicacao(primeiroValor, segundoValor);
                        break;
                    case 4:
                        simboloOperacao = '/';
                        if (segundoValor == 0) {
                            System.out.println("\nO segundo valor é um numero inválido para o divisor!");
                            operacaoValida = false;
                        } else {
                            resultado = calcularDivisao(primeiroValor, segundoValor);
                        }
                        break;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA!");
                        operacaoValida = false;
                }

                if(operacaoValida == true){
                exibirResultado(primeiroValor, segundoValor, resultado, simboloOperacao);
                }

                System.out.println("\n\nDeseja sair? digite 's' para sim ou qualquer outra tecla para continuar:");
                desejaSair = input.nextLine();
            }
            System.out.println("PROGRAMA ENCERRADO, ATÉ LOGO!");
            input.close();
        }

        public static double calcularAdicao ( double somando, double adendo){
            return somando + adendo;
        }
        public static double calcularSubtracao ( double minuendo, double subtraendo){
            return minuendo - subtraendo;
        }
        public static double calcularMultiplicacao ( double multiplicando, double multiplicador){
            return multiplicando * multiplicador;
        }
        public static double calcularDivisao ( double dividendo, double divisor){
            return dividendo / divisor;
        }

        public static void exibirResultado ( double primeiroValor, double segundoValor, double resultado, char simbolo){
            System.out.printf("Resultado: %.1f %c %.1f = %.1f", primeiroValor, simbolo, segundoValor, resultado);
        }
}
