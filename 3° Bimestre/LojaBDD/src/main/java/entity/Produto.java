package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "Produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private float preco;

    private static int idBase = 1;

    public Produto(String nome, float preco) {
        this.id = idBase;
        this.nome = nome;
        this.preco = preco;
        idBase++;
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
        return "| Produto |" + "id: " + id + ", nome: " + nome + ", preco: " + preco;
    }
}
