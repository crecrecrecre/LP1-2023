package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer vagas;
    @Column
    private String destino;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "piloto_id")
    private Piloto piloto;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "viagem-passageiro", joinColumns = @JoinColumn(name = "viagem_id"), inverseJoinColumns = @JoinColumn(name = "passageiro_id"))
    private List<Passageiro> passageiros;

    public Viagem(Integer vagas, String destino) {
        this.vagas = vagas;
        this.destino = destino;
        this.passageiros = new ArrayList<>();
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        if(passageiros.size() > vagas)
            System.out.println("Essa viagem só pode receber " + this.vagas + " vagas!");
        else
            this.passageiros = passageiros;
    }

    public void addPassageiro(Passageiro passageiro){
        if (this.passageiros.size() < vagas){
            this.passageiros.add(passageiro);
        }
        else {
            System.out.println("Limite de vagas excedido!");
        }
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "id=" + id +
                ", vagas=" + vagas +
                ", destino='" + destino + '\'' +
                ", piloto=" + piloto +
                ", passageiros=" + passageiros +
                '}';
    }
}
