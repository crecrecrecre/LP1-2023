package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String CPF;

    @Column
    private Double salarioFunc;

    public Funcionario(String nome, String CPF, Double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salarioFunc = salarioFunc;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Double getSalarioFunc() {
        return salarioFunc;
    }

    public void setSalarioFunc(Double salarioFunc) {
        this.salarioFunc = salarioFunc;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", salario=" + salarioFunc +
                '}';
    }
}
