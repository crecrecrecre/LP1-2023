package Model;

import Exception.ComercializarException;
import Model.*;

public class Servico extends Item {

    private Boolean disponivel;


    public Servico(String nome, double preco, Boolean disponivel) {
        super(nome, preco);
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "disponivel=" + disponivel + ", id=" + id + ", nome='" + nome + '\'' + '}';
    }

    public void comercializar() throws ComercializarException {
        if (disponivel == false){
            throw new ComercializarException("indisponivel mo");
        }
        disponivel = false;
    }

    public void liberar() throws ComercializarException {
        if (disponivel == true){
            throw new ComercializarException("item disponivellll!!");
        }
        disponivel = true;
    }
}
