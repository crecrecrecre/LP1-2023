package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Professor {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private  String nome;
    @Column
    private String cpf;
    @Column
    private  String prontuario;
    @Column
    private String senha;

    public Professor(String senha, String cpf, String nome, String prontuario) {
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.prontuario = prontuario;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                '}';
    }
}
