package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_pedido")
    private Pessoa cliente;

    @Column
    private List <Produto> produtos = new ArrayList<>();

    public Pedido(Pessoa cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", cliente=" + cliente + ", produtos=" + produtos + '}';
    }
}
