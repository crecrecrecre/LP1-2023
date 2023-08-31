package model;

import repository.ExibirInterface;
import java.util.List;

public class Pedido extends Orcamento implements ExibirInterface {
    private String dataEntrega;
    private boolean entregue;
    //Não declarei com "private".

    public Pedido(String dataEntrega) {
        this.dataEntrega = dataEntrega;
        this.entregue = false;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void entregar() {
        try {
            if (this.entregue) {
                throw new Exception();
            } else {
                this.entregue = true;
            }
        } catch (Exception e) {
            System.err.println("O pedido já foi entregue!");
        }
    }

    public void exibir(Boolean completa) {
        if (completa) {
            pedidoCompleto(this);
        } else {
            pedidoReduzido(this);
        }
    }

    private void pedidoCompleto(Pedido p) {
        System.out.println("Pedido " + p.getId());
        System.out.println("Itens:");
        for (ItemPedido item : itens) {
            System.out.println("- " + item.getPeca() + ", " + item.getModelo() + ", " + item.getTamanho() + ", " + item.getValor());
        }
        System.out.println("Data de Entrega: " + p.getDataEntrega());
        System.out.print("Situação: ");
        if(entregue) {
            System.out.print("Entregue");
        } else {
            System.out.print("Não entregue");
        }
        System.out.println();
        System.out.println("Valor Total: R$" + p.getValorTotal());
    }

    private void pedidoReduzido(Pedido p) {
        System.out.print("- Pedido " + p.getId());
        System.out.printf(", %s, ", p.getDataEntrega());
        System.out.print(" Situação: ");
        if(p.entregue) {
            System.out.print("Entregue");
        } else {
            System.out.print("Não entregue");
        }
        System.out.printf(", %s", p.getValorTotal());
    }
}

