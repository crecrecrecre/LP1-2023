package entity;

import jakarta.persistence.*;

@Entity
@Table

public class Nota {


    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private double nota;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "turmaid")
    private Turma turma;

    public Nota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", nota=" + nota +
                '}';
    }
}
