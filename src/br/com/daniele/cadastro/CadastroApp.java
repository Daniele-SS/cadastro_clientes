package br.com.daniele.cadastro;

import br.com.daniele.cadastro.ui.CadastroUI;

import java.time.LocalDate;

public class CadastroApp {
    public static void main(String[] args) {
        CadastroUI cadastroUI = new CadastroUI();
        cadastroUI.criarMenu();
    }
}
