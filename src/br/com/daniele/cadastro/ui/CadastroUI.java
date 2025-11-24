package br.com.daniele.cadastro.ui;

import br.com.daniele.cadastro.model.Cliente;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

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
        switch (opcao) {
            case 1:
              cadastrarCliente();
              break;
            case 2:
              System.out.println("Listar Todos");
              break;
            case 3:
              System.out.println("Exibir Cliente");
              break;
            case 4:
              System.out.println("Excluir Cliente");
              break;
            case 5:
              System.out.println("Atualizar Cliente");
              break;
            case 6:
              System.out.println("Sair");
              break;

            default:
              System.out.println("Opção inválida! Escolha uma opção válida.");
              criarMenu();
              break;
        }
    }

    private void cadastrarCliente(){
        UUID id = UUID.randomUUID();

        Cliente cliente = new Cliente();
        cliente.id = id.toString();

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Nome do cliente: ");
        cliente.nome = sc.nextLine();

        System.out.print("Email do cliente: ");
        cliente.email = sc.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNascimento = sc.nextLine();

        dataNascimento = dataNascimento.replace("-", "/");
        String[] dataNascimentoSplit = dataNascimento.split("/");

        cliente.dataNascimento = LocalDate.of(
                Integer.parseInt(dataNascimentoSplit[2]),
                Integer.parseInt(dataNascimentoSplit[1]),
                Integer.parseInt(dataNascimentoSplit[0])
        );
        cliente.exibirCliente();
    }
}
