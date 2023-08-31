package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String CPF;

    public Passageiro(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
