package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class Gerente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private Double salarioGerente;

    @Column
    private String responsabilidade;

    public Gerente(String nome, Double salario, String responsabilidade) {
        this.nome = nome;
        this.salarioGerente = salario;
        this.responsabilidade = responsabilidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioGerente() {
        return salarioGerente;
    }

    public void setSalarioGerente(Double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }

    public String getResponsabilidade() {
        return responsabilidade;
    }

    public void setResponsabilidade(String responsabilidade) {
        this.responsabilidade = responsabilidade;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salarioGerente +
                ", responsabilidade='" + responsabilidade + '\'' +
                '}';
    }
}
