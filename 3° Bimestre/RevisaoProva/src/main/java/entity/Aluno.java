package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Aluno {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nome;
    @Column
    private  String prontuario;
    @Column
    private String senha;
    @Column
    private double media;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "AlunoNota", joinColumns = @JoinColumn(name = "alunoid"), inverseJoinColumns = @JoinColumn(name = "notaid"))
    private List<Nota> notas = new ArrayList<>();


    public Aluno(String senha, String nome, String prontuario) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.notas = new ArrayList<>();
        this.media = 0.0;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void addNotas(Nota nota){
        this.notas.add(nota);
        if (this.notas.size() ==1)
            media = nota.getNota();
        else
            media = (media + nota.getNota())/2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", senha='" + senha + '\'' +
                ", notas=" + notas +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                '}';
    }
}


