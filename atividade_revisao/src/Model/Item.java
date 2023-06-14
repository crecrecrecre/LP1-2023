package Model;
import Interface.ComercializarInterface;

public abstract class Item implements ComercializarInterface {
    long id;
    String nome;
    double preco;
    static long idBase = 0;

    public Item(String nome, double preco) {
        id = idBase++;
        this.nome = nome;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static long getIdBase() {
        return idBase;
    }

    public static void setIdBase(long idBase) {
        Item.idBase = idBase;
    }

    public String toString() {
        return "Item{" + "id=" + id + ", nome='" + nome + '\'' + ", preco=" + preco + '}';
    }
}
