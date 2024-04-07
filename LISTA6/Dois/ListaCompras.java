package LISTA6.Dois;

import java.util.ArrayList;

public class ExercicioDois {
    private ArrayList<String> lista;

    public ExercicioDois() {
        this.lista = new ArrayList<String>();
    }

    public void adicionarItem(String item) {
        this.lista.add(item);
    }

    public void removerItem(String item) {
        if (this.lista.contains(item)) {
            this.lista.remove(item);
        } else {
            System.out.println("O item " + item + " não está na lista de compras.");
        }
    }

    public void exibirLista() {
        for (String item : this.lista) {
            System.out.println(item);
        }
    }
}
