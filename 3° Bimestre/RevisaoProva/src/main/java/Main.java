import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("5896","pedro","sp3051489");
        Aluno a2 = new Aluno("8749","rafaela","sp3082651");

        Nota n1 = new Nota(5);
        Nota n2 = new Nota(10);
        Nota n3 = new Nota(9);
        Nota n4 = new Nota(7);

        Professor p1 = new Professor("1234", "12345678954","larissa","sp3072266");
        Professor p2 = new Professor("1714", "54789632154","jose", "sp3021458");

        Turma turma =new Turma(4, "230");

        turma.addAlunos(a1);
        turma.addAlunos(a2);

        a1.addNotas(n1);
        a1.addNotas(n2);
        a2.addNotas(n3);
        a2.addNotas(n4);

        turma.setProfessor(p1);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(turma);

        transaction.commit();

        List<Turma> turmas = session.createQuery("From Turma", Turma.class).list();

        turma.ExibirTurma();

    }
}
