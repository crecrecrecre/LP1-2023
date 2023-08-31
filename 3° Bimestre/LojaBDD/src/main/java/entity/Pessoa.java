package entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="Pessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_Endereco")
    private Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Pedido> pedidos;

    public Pessoa(String nome, String sobrenome, String email, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "| Pessoa | " + "id: " + id + ", nome: " + nome + ", sobrenome: " + sobrenome + ", email: " + email +  endereco;
    }
}
