package br.senai.sp.jandira.Model;

import java.util.List;

public class Output {
    public void PrintUsuario(Usuario usuario) {
        System.out.println("---------------------------------------------------");
        System.out.println("                  INFORMAÇÕES LEITOR                ");
        System.out.println("Nome leitor: " + usuario.getNome());
        System.out.println("Email leitor: " + usuario.getEmail());
        System.out.println("Endereço leitor: " + usuario.getEndereco());
        System.out.println("Telefone leitor: " + usuario.getTelefone());
    }
    public void PrintLivro(Livros livros) {
        System.out.println("---------------------------------------------------");
        System.out.println("                  INFORMAÇÕES LIVRO                ");
        System.out.println("Título livro: " + livros.getTitulo());
        System.out.println("Autor livro: " + livros.getAutor());
        System.out.println("Gênero livro: " + livros.getGenero());
        System.out.println("ISBN livro: " + livros.getIsbn());
        System.out.println("---------------------------------------------------");
    }
}

