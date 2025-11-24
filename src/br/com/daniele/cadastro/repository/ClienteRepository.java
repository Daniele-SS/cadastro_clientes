package br.com.daniele.cadastro.repository;

import br.com.daniele.cadastro.model.Cliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ClienteRepository {
    private Cliente cliente;

    public void cadastrar(){
        //Obter o caminho para o arquivo
        Path arquivo = Path.of("C:\\Users\\25203622\\DS1M\\clientes\\clientes.csv");
        try {
            Files.writeString(arquivo, "Senai Jandira", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo!!");
            System.out.println(e.getMessage());
        }
    }

    public void excluir(){

    }

    public void listar(){

    }

    public void exibirPorId(){

    }

    public void atualizar(){

    }
}
