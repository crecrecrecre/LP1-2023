package entity;

import jakarta.persistence.*;
@Entity (name = "Endereco")
@Table (name = "Endereco")

public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String rua;

    @Column
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +  "id=" + id +  ", rua='" + rua + '\'' +  ", cidade='" + cidade + '\'' +  '}';
    }
}
