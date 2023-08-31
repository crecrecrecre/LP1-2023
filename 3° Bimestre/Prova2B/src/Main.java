import model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // ● Criar um objeto do ItemPedido.
        // ● Exibir ItemPedido completo.
        // ● Exibir ItemPedido reduzido.
        ItemPedido i1 = new ItemPedido("Camiseta", "Oversized", "M", 99.00);
        i1.exibir(true);
        i1.exibir(false);

        // ● Criar Orçamento.
        // ● Adicionar o item criado no orçamento.
        // ● Exibir orçamento completo.
        // ● Exibir orçamento reduzido.
        Orcamento o = new Orcamento();
        o.addItem(i1);
        System.out.println();
        o.exibir(true);
        System.out.println();
        o.exibir(false);

        // ● Adicionar outro item ao orçamento.
        // ● Exibir orçamento completo.
        // ● Remover o último item que foi adicionado.
        // ● Exibir orçamento completo.
        ItemPedido i2 = new ItemPedido("Calça", "Cargo", "M", 160.00);
        o.addItem(i2);
        System.out.println();
        o.exibir(true);
        System.out.println();
        o.removerItem(2L);
        o.exibir(true);

        // ● Tentar remover um item que não existe no orçamento.
        // ● Exibir orçamento completo.
        o.removerItem(19L);
        o.exibir(true);

        // ● Criar pedido
        // ● Adicionar o item criado no pedido.
        // ● Exibir pedido completo.
        // ● Exibir pedido reduzido.
        Pedido pedido = new Pedido("31/08/2023");
        pedido.addItem(i2);
        System.out.println();
        pedido.exibir(true);
        System.out.println();
        pedido.exibir(false);

        // ● Entregar pedido.
        // ● Exibir pedido reduzido.
        // ● Tentar entregar o mesmo pedido novamente.
        // ● Exibir pedido reduzido.
        pedido.entregar();
        System.out.println();
        pedido.exibir(false);
        System.out.println();
        pedido.entregar();
        pedido.exibir(false);
    }
}