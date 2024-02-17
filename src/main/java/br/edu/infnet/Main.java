package br.edu.infnet;

public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Livro
        Livro livro1 = new Livro("1984", "George Orwell", 1949, "Ficção Científica", true);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia", false);
        Livro livro3 = new Livro("Orgulho e Preconceito", "Jane Austen", 1813, "Romance", false);

        // Exibindo informações dos livros
        exibirInformacoesLivro(livro1);
        exibirInformacoesLivro(livro2);
        exibirInformacoesLivro(livro3);

        // Exibindo status de empréstimo dos livros
        exibirStatusEmprestimo(livro1);
        exibirStatusEmprestimo(livro2);
        exibirStatusEmprestimo(livro3);
    }

    public static void exibirInformacoesLivro(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("-----------------------------");
    }

    public static void exibirStatusEmprestimo(Livro livro) {
        System.out.println("Status de empréstimo de '" + livro.getTitulo() + "': " + livro.statusEmprestimo());
        System.out.println("-----------------------------");
    }
}
