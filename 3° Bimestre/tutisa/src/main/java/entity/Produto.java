package entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Produto")

public class Produto {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column
    private String nome;

    @Column
    private float preco;

    public Produto(String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome='" + nome + '\'' + ", preco=" + preco + '}';
    }
}
