package model;
import repository.ExibirInterface;

public class ItemPedido implements ExibirInterface {
    private static long idBase = 1L;
    private long id;
    private String peca;
    private String modelo;
    private String tamanho;
    private double valor;

    public ItemPedido(String peca, String modelo, String tamanho, double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
        id = idBase++;
    }

    public long getId() {
        return id;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibir(Boolean completa) {
        if (completa) {
            completo(this);
        } else {
            reduzido(this);
        }
    }

    private void completo(ItemPedido i) {
        System.out.println("Item do pedido: " + i.getId());
        System.out.println("- Peça: " + i.getPeca());
        System.out.println("- Modelo: " + i.getModelo());
        System.out.println("- Tamanho: " + i.getTamanho());
        System.out.println("- Valor: R$" + i.getValor());
    }

    private void reduzido(ItemPedido i) {
        System.out.printf("\n- %s, %s, %s, R$%.2f", i.getPeca(), i.getModelo(), i.getTamanho(), i.getValor());
    }
}
