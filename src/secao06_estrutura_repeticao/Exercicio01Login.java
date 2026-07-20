package secao06_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio01Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String login = "";
        String password = "";

        System.out.println("ÁREA DE ACESSO");

        do {
            System.out.print("Login: ");
            login = sc.nextLine().trim();

            System.out.print("Senha: ");
            password = sc.nextLine().trim();

            if (!login.equals("wolive") || !password.equals("1234")) {
                System.out.println("Erro: Dados incorretos. Tente novamente.\n");
            }

        } while (!login.equals("wolive") || !password.equals("1234"));

        System.out.printf("Login efetuado com sucesso: Bem vindo! %s\n", login);

        sc.close();
    }
}
