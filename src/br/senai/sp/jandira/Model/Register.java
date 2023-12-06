package br.senai.sp.jandira.Model;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Register {
    private int validaPrint = 0;
    private Scanner teclado = new Scanner(System.in);
    private List<Usuario> clientes = new ArrayList<>();

    public Usuario cadastrarLeitor() {
        Usuario usuario = new Usuario();

        System.out.println("---------------- Cadastro Leitor -----------------");

        System.out.print("Insira o seu nome: ");
        usuario.nome = teclado.nextLine();

        System.out.print("Insira o email: ");
        usuario.email = teclado.nextLine();

        System.out.print("Insira o seu endereço: ");
        usuario.endereco = teclado.nextLine();

        System.out.print("Insira o seu telefone: ");
        usuario.telefone = teclado.nextLine();
        System.out.println("--------- Cadastrado realizado --------------------");

        clientes.add(usuario);

        if (validaPrint != 1) {
            Output output = new Output();
            output.PrintUsuario(usuario);
        }

        return usuario;
    }

    public List<Usuario> getClientes() {
        return clientes;
    }

    public void listarLeitoresCadastrados() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum leitor cadastrado.");
        } else {
            System.out.println("\n****************************************");
            System.out.println("            Leitores Cadastrados          ");
            for (Usuario cliente : clientes) {
                System.out.println("Nome leitor: " + cliente.getNome());
                System.out.println("Email leitor: " + cliente.getEmail());
                System.out.println("Endereço leitor: " + cliente.getEndereco());
                System.out.println("Telefone leitor: " + cliente.getTelefone());
                System.out.println("***************************************");
            }
        }
    }

    public Livros cadastrarLivro() {
        Livros livro = new Livros();

        System.out.println("--------------- Cadastro de Livro ---------------");
        System.out.print("Título do livro: ");
        livro.titulo = teclado.nextLine();
        System.out.print("Autor do livro: ");
        livro.autor = teclado.nextLine();
        System.out.print("Gênero do livro: ");
        livro.genero = teclado.nextLine();
        System.out.print("ISBN do livro: ");
        livro.isbn = teclado.nextLine();
        System.out.println("--------- Cadastro Realizado ---------");

        if (validaPrint != 1) {
            Output output = new Output();
            output.PrintLivro(livro);
        }

        return livro;
    }
}

