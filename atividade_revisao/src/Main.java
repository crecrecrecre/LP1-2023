import Model.*;

public class Main {
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa ();
        empresa1.addItem(new Produto("carrin", 10.5, 1));
        empresa1.addItem(new Servico("piloto", 2300.0, true));

        empresa1.ComercializarItem(0L);
        empresa1.ComercializarItem(0L);
        empresa1.ComercializarItem(1L);
        empresa1.ComercializarItem(1L);
    }


}