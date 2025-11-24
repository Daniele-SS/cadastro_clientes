package br.com.daniele.cadastro.model;

import java.time.LocalDate;

public class Cliente {

    public int id;
    public String nome;
    public String email;
    public LocalDate dataNascimento;

    public void exibirCliente(){
        System.out.println("ID: " + id);
        System.out.println("NOME: " + nome);
        System.out.println("EMAIL: " + email);
        System.out.println("DATA NASCIMENTO: " + dataNascimento);
    }

    public class CadastroApp {
        public static void main(String[] args) {
            System.out.println("Cadastro de Clientes");

            Cliente clientePaulo = new Cliente();
            Cliente clienteAna = new Cliente();
            Cliente clienteBruno = new Cliente();

            clientePaulo.id = 1;
            clientePaulo.nome = "Paulo de Oliveira";
            clientePaulo.email = "paulo@email.com";
            clientePaulo.dataNascimento = LocalDate.of(1999, 5, 14);

            clienteAna.id = 2;
            clienteAna.nome = "Ana da Silva";
            clienteAna.email = "ana@email.com";
            clienteAna.dataNascimento = LocalDate.of(2010, 11, 24);

            clienteBruno.id = 3;
            clienteBruno.nome = "Bruno Gomes";
            clienteBruno.email = "bruno@email.com";
            clienteBruno.dataNascimento = LocalDate.of(1987, 3, 3);

            clientePaulo.exibirCliente();
            clienteAna.exibirCliente();
            clienteBruno.exibirCliente();
        }
    }
}
