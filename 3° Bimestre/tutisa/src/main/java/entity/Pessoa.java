package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity //determina que a classe é uma entidade do bdd
@Table (name= "pessoa")//entidade tabela- criar tabela- tabela é a "pessoa"


public class Pessoa {

    @GeneratedValue (strategy = GenerationType.IDENTITY) //gerar valores do id automaticamente | strategy: estrategia p gerar os valores automaticamente
    //chave primária:
    @Id //chave primaria, independente doq seja sempre será @Id
    @Column //determina os atributos como coluna
    private int id;

    //não chaves:
    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private String email;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "endereco_id")
    private Endereco endereco;
    @OneToMany (cascade =  CascadeType.ALL, mappedBy = "cliente")
    private List <Pedido> pedidos;


    public Pessoa(String nome, String sobrenome, String email) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
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
        return "Pessoa{" + "id=" + id + ", nome='" + nome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", email='" + email + '\'' + '}';
    }
}