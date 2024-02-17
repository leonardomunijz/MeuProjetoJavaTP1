package br.edu.infnet;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean emprestado;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
        setGenero(genero);
    }

    public Livro(String titulo, String autor, int anoPublicacao, String genero, boolean emprestado) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
        setGenero(genero);
        setEmprestado(emprestado);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    // Setters
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser vazio");
        }
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao < 1455 || anoPublicacao > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("Ano de publicação deve estar entre 1455 e o ano atual");
        }
        this.anoPublicacao = anoPublicacao;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("Gênero não pode ser vazio");
        }
        this.genero = genero;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Método para verificar o status do empréstimo do livro
    public String statusEmprestimo() {
        if (emprestado) {
            return "Livro emprestado.";
        } else {
            return "Livro disponível para empréstimo.";
        }
    }
}
