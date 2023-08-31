import entity.Passageiro;
import entity.Piloto;
import entity.Viagem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("Igor", "abc123");
        Passageiro passageiro1 = new Passageiro("Maria", "12345678998");
        Passageiro passageiro2 = new Passageiro("Joaquim", "78965412398");
        Passageiro passageiro3 = new Passageiro("Iris", "65472398514");
        Passageiro passageiro4 = new Passageiro("Jorge", "52462871458");
        Passageiro passageiro5 = new Passageiro("Antonieta", "58463259874");

        Viagem viagem = new Viagem(4, "Recife");

        viagem.setPiloto(piloto);
        viagem.setPassageiros(new ArrayList<>(List.of(passageiro1, passageiro2, passageiro3, passageiro4, passageiro5)));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(viagem);

        transaction.commit();

        List<Viagem> viagens = session.createQuery("from Viagem", Viagem.class).list();
        viagens.forEach(v -> System.out.println(v));

        System.out.println(viagens.get(0));

    }
}
