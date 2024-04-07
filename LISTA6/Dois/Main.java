package LISTA6.Dois;

public class Main {
    public static void main(String[] args) {
        ExercicioDois minhaLista = new ExercicioDois();
        minhaLista.adicionarItem("Batata");
        minhaLista.adicionarItem("Carne");
        System.out.println("Lista de compras após adicionar itens:");
        minhaLista.exibirLista();  
        minhaLista.removerItem("Batata");
        System.out.println("Nova Lista:");
        minhaLista.exibirLista();  
    }
}
