package util;

import entity.Departamentos;
import entity.Empresa;
import entity.Funcionario;
import entity.Gerente;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Isabela", "54005409887", 2000.0);
        Funcionario funcionario2 = new Funcionario("Igor", "12345678976", 2000.0);
        Funcionario funcionario3 = new Funcionario("Felipe", "98765432109", 2000.0);

        Gerente gerente1 = new Gerente("Leticia", 3000.0, "Supervisiona todos os empregados");

        Departamentos departamento = new Departamentos("dpt1");

        Empresa empresa = new Empresa("IsaIgor");


        departamento.setGerente(gerente1);
        Departamentos.setFuncionario(new ArrayList<>(List.of(funcionario1, funcionario2, funcionario3)));


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(departamento);

        transaction.commit();

        List<Funcionario> funcionarios = session.createQuery("from Funcionario", Funcionario.class).list();

        funcionarios.forEach(v -> System.out.println(v));

        System.out.println(funcionarios.get(0));




    }
}
