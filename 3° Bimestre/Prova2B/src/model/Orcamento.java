package model;

import model.*;
import repository.ExibirInterface;
import java.util.*;

public class Orcamento implements ExibirInterface{
    private static long idBase = 1L;
    private long id;
    public List<ItemPedido> itens = new ArrayList<>();
    private double valorTotal;
    //Não tinha declarado eles como "private".

    public Orcamento() {
        this.id = idBase++;
    }

    public static long getIdBase() {
        return idBase;
    }

    public long getId() {
        return id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void addItem(ItemPedido item) {
        itens.add(item);
        valorTotal += item.getValor();
    }

    public void removerItem(Long id) throws Exception {
        try {
            for (ItemPedido item : itens) {
                if (item.getId() == id) {
                    valorTotal -= item.getValor();
                    itens.remove(item);
                    System.out.println("Item " + item.getId() + " removido do orçamento!");
                    return;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.err.println("O item não foi encontrado!");
        }
    }

    public void exibir(Boolean completa) {
        if(completa) {
            completo(this);
        } else {
            reduzido(this);
        }
    }

    private void completo(Orcamento o) {
        System.out.println();
        System.out.println("Orçamento " + o.getId());
        for (ItemPedido item : itens) {
            System.out.printf("- %s, %s, %s, %s\n", item.getPeca(), item.getModelo(), item.getTamanho(), item.getValor());
        }
        System.out.println("Valor total do orçamento: R$" + o.getValorTotal());
    }

    private void reduzido(Orcamento o) {
        System.out.print("- Orçamento " + o.getId());
        System.out.printf(", R$%.2f", o.getValorTotal());
    }
}
