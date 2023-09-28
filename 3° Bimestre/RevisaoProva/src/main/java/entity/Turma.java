package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Turma {


    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Integer horario;
    @Column
    private  String codigo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professorid")
    private Professor professor;
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name = "TurmaAluno", joinColumns = @JoinColumn(name = "turmaid"), inverseJoinColumns = @JoinColumn (name = "alunoid"))
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(Integer horario, String codigo) {
        this.horario = horario;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void addAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public void ExibirTurma(){
        System.out.println("--------------------------TURMA-------------------------");
        for (Aluno aluno: alunos){
            System.out.println("ID do aluno: " + aluno.getId());
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("Senha do aluno: " + aluno.getSenha());
            System.out.println("Prontuário do aluno: " + aluno.getProntuario());
            System.out.println("Nota do aluno: " + aluno.getNotas());
            System.out.println("Media do aluno: " + aluno.getMedia());
            System.out.println("---------------------------------------------------------------");
        }
            System.out.println("Professor da Turma:" + getProfessor());
            System.out.println("---------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", professor=" + professor +
                ", horario=" + horario +
                ", alunos=" + alunos +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
