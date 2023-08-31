package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="Pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NomeCliente")
    private Pessoa cliente;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PedidoProduto", joinColumns = @JoinColumn(name = "idPedido"), inverseJoinColumns = @JoinColumn(name = "idProduto"))
    private static List<Produto> listaProdutos;
    @Column
    private double precoTotal;

    public Pedido(Pessoa cliente, List<Produto> listaProdutos) {
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.precoTotal = valorTotal();
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    private static float valorTotal(){
        double valorT = 0;
        for (Produto produto: listaProdutos) {
            valorT = valorT + produto.getPreco();
        }
        return (float) valorT;
    }

    public void addItem(Produto produto) {
        listaProdutos.add(produto);
        precoTotal += produto.getPreco();
    }

    public void removerItem(int id) {
        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                precoTotal -= p.getPreco();
                listaProdutos.remove(p);
                System.out.println("Produto " + p.getId() + " removido do orçamento!");
                return;
            }
        }
        System.out.println("O item não foi encontrado!");
    }

    @Override
    public String toString() {
        return "| Pedido | " + "id: " + id + ", cliente: " + cliente + ", Lista de Produtos: " + listaProdutos;
    }
}
