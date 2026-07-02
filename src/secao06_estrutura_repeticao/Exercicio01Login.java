package secao06_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio01Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração limpa, sem precisar forçar valor inicial de string vazia
        String login;
        String password;

        System.out.println("=== SISTEMA DE ACESSO ===");

        // O do-while roda primeiro e testa a condição depois
        do {
            System.out.print("Login: ");
            login = sc.nextLine().trim(); // .trim() é padrão profissional para evitar espaços bobos

            System.out.print("Senha: ");
            password = sc.nextLine().trim();

            // Validação simples e direta
            if (!login.equals("wolive") || !password.equals("1234")) {
                System.out.println("Erro: Dados incorretos. Tente novamente.\n");
            }

        } while (!login.equals("wolive") || !password.equals("1234"));

        System.out.printf("\nLogin efetuado com sucesso! Bem-vindo, %s.\n", login);

        sc.close();
    }
}
