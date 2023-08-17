import entity.Endereco;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Pedro Vicente", "São Paulo");
        Endereco endereco2 = new Endereco("Rua Conselheiro Moreira de Barros", "São Paulo");
        Endereco endereco3 = new Endereco("Rua corinthians", "filha do são paulo");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(endereco1);
        session.persist(endereco2);
        session.persist(endereco3);

        transaction.commit();

        //List <Endereco> enderecos = session.createQuery("from Endereco", Endereco.class).list();

        System.out.println();
        session.createQuery("from Endereco", Endereco.class).list().forEach(e -> System.out.println(e));

    }
}
