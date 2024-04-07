package LISTA6.UM;

import java.util.ArrayList;
import java.util.List;

public class ListaDeContato {
    private List<Contato> contatos;

    public ListaDeContato() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        contatos.add(contato);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getNumero());
        }
    }
}
