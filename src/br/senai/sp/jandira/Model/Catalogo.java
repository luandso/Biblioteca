package br.senai.sp.jandira.Model;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Livros> livrosCatalogo = new ArrayList<Livros>();
    private ArrayList<Livros> livrosEmprestados = new ArrayList<Livros>();

    public Catalogo() {
        Livros livro1 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", "TFntasia épica", "11111");
        Livros livro2 = new Livros("1984", "George Orwell", "Ficção distópica", "22222");
        Livros livro3 = new Livros("Crime e Castigo", "Fiódor Dostoiévski", "Romance psicológico", "33333");
        Livros livro4 = new Livros("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Literatura infantil e filosofia", "44444");
        Livros livro5 = new Livros("Dom Quixote", "Miguel de Cervantes", "Romance satírico", "55555");

        livrosCatalogo.add(livro1);
        livrosCatalogo.add(livro2);
        livrosCatalogo.add(livro3);
        livrosCatalogo.add(livro4);
        livrosCatalogo.add(livro5);
    }
    public void adicionarLivro(Livros livro) {
        livrosCatalogo.add(livro);
    }
    public Livros tituloDoLivro(String titulo) {
        for (Livros livro : livrosCatalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    public void listarLivrosDisponiveis() {
        ArrayList<Livros> livrosDisponiveis = new ArrayList<>();

        for (Livros livro : livrosCatalogo) {
            if (!livro.isEmprestado()) {
                livrosDisponiveis.add(livro);
            }
        }
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Livros indisponíveis para empréstimo.");
        } else {
            System.out.println("Livros disponíbilizados para empréstimo: \n");
            for (Livros livro : livrosDisponiveis) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Gênero: " + livro.getGenero());
                System.out.println("ISBN: " + livro.getIsbn());
                System.out.println("Status: Disponível");
            }
        }
    }

    public void listarLivros() {
        if (livrosCatalogo.isEmpty()) {
            System.out.println("O catálogo está indisponível.");
        } else {
            System.out.println("Catálogo de Livros:\n");
            for (Livros livro : livrosCatalogo) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Gênero: " + livro.getGenero());
                System.out.println("ISBN: " + livro.getIsbn());
                if (livro.isEmprestado()) {
                    System.out.println("Status: Emprestado");
                } else {
                    System.out.println("Status: Livro disponível");
                }
                System.out.println("-----------------------------------------");
            }
        }
    }

    public void listarLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Todos os livros disponíveis.");
        } else {
            System.out.println("Livros Emprestados:\n");
            for (Livros livro : livrosEmprestados) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Gênero: " + livro.getGenero());
                System.out.println("ISBN: " + livro.getIsbn());
                System.out.println("-----------------------------------------");
            }
        }
    }

    public boolean emprestarLivro(Livros livro) {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            return true;
        } else {
            return false;
        }
    }

    public boolean devolverLivro(Livros livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
            return true;
        } else {
            return false;
        }
    }
}

