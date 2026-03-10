package br.com.vini.mod13.Interfaces.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Mostrar usuário");
            System.out.println("3 - Atualizar nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); // limpar buffer
                    usuario.cadastrarUsuario(nome, idade);
                    break;
                case 2:
                    usuario.mostrarUsuario();
                    break;
                case 3:
                    System.out.print("Digite o novo nome: ");
                    String novoNome = sc.nextLine();
                    usuario.atualizarNome(novoNome);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        } while (opcao != 0);
    }
}

