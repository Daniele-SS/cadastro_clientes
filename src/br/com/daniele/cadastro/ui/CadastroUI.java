package br.com.daniele.cadastro.ui;

import java.util.Scanner;

public class CadastroUI {
    public int opcao;

    public void criarMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Exibir ciente por id");
        System.out.println("4 - Excluir ciente");
        System.out.println("5 - Atualizar ciente");
        System.out.println("6 - Sair");
        System.out.println("---------------------");
        System.out.println();
        System.out.print("Escolha uma opção (1-6): ");

        opcao = sc.nextInt();
    }
}
