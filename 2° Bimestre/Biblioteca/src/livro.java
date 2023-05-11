public class livro {
    private String nome_livro;
    private String autor;
    private int ano;

    public livro (String nome_livro, String autor, int ano){
        this.nome_livro = nome_livro;
        this.autor = autor;
        this.ano = ano;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
