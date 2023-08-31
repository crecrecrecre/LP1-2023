package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Departamentos {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

     @Column
    private String nome;

     @OneToOne(cascade = CascadeType.ALL)
    private Gerente gerente;

     @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name= "funcionario_id")
    private List<Funcionario> funcionarios;

     @Column
     private Double custo;

    public Departamentos(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public Departamentos(String nome, Gerente gerente, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = funcionarios;

        for (int i = 0; i < (funcionarios.size()); i++) {
            Double custo = funcionarios.get(i).getSalarioFunc() + getGerente().getSalarioGerente();

            
        }

    }

    public static void setFuncionario(ArrayList<Funcionario> funcionarios) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "Departamentos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", gerente=" + gerente +
                ", funcionarios=" + funcionarios +
                '}';
    }

   // public void custoDept(List<Departamentos> departamentos){
     //   System.out.println("O custo desse departamento é: " Double salarioGerente + Double salarioFunc);
       // }
}
