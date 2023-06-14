package Model;

import Exception.ComercializarException;

public class Produto extends Item {

    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        super(nome, preco);
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {

        this.estoque = estoque;
    }

    public void comercializar() throws ComercializarException {
        if (estoque <= 0 ){
            throw new ComercializarException("tem nao mo");
        }

        estoque -= estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "estoque=" + estoque +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
