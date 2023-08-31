import entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        gerenciarPedido();
    }

    public static void gerenciarPessoa(){
        Pessoa p1 = new Pessoa("Henry", "Zitos", "henriqui@gmail.com", new Endereco("Avenida Guapira", "TucuCity"));
        Pessoa p2 = new Pessoa("Isabela", "Crestiane", "garotamulher@gmail.com", new Endereco("Casa da Vovó", "Lauzane"));
        Pessoa p3 = new Pessoa("Feehzinho", "Wit","fefaswit@gmail", new Endereco("Avenida Itaquera", "Arturalville"));
        Pessoa p4 = new Pessoa("Sadly", "Thur", "sadlythur@gmail.com", new Endereco("Rua da Maconhar", "Portugal"));
        Pessoa p5 = new Pessoa("Lele", "Rudeli", "amoloiros@gmail.com", new Endereco("Casa da Mônica", "Bairro do Limão"));

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();
        pessoas.forEach(p -> System.out.println(p));

        /*List<Endereco> enderecos = session.createQuery("from Endereco", Endereco.class).list();
        enderecos.forEach(e -> System.out.println(e));*/
    }

    public static void gerenciarPedido(){
        Pessoa p1 = new Pessoa("Henry", "Zitos", "henry@gmail.com", new Endereco("Minha casa", "São Paulo"));
        Produto pr1 = new Produto("Blusar", 25.5F);
        Produto pr2 = new Produto("Casacor", 120.0F);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Pedido pedido = new Pedido(p1, new ArrayList<>(List.of(pr1, pr2)));
        session.persist(pedido);
        List<Pedido> pedidos = session.createQuery("from Pedido", Pedido.class).list();
        pedidos.forEach(p -> System.out.println(p));

        pedido.removerItem(2);
        session.persist(pedido);
        pedidos = session.createQuery("from Pedido", Pedido.class).list();
        pedidos.forEach(p -> System.out.println(p));

        transaction.commit();

        //List<Pedido> pedidos = session.createQuery("from Pedido", Pedido.class).list();
        //pedidos.forEach(p -> System.out.println(p));
    }
}
