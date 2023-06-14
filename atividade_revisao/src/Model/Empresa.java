package Model;

import Exception.ComercializarException;
import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa {


    List<Item> itens = new ArrayList<>();

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem (Item item){
        itens.add(item);
    }
    public void ListarItens(){
        for (Item i: itens) {
            System.out.println(i);
        }
    }

    public void ComercializarItem (Long id){
        for (Item i: itens) {
            if (i.getId() == id){
                try {
                    i.comercializar();
                } catch (ComercializarException e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }
    }


}
