package bstnomes;

public class Main {
    public static void main (String[] args) {
        arvoreNomes arvore = new arvoreNomes();

        System.out.println("Inserindo nomes: Maria, Ana, João, Pedro, Bruno, Carla");
        arvore.inserir("Maria");
        arvore.inserir("Ana");
        arvore.inserir("João");
        arvore.inserir("Pedro");
        arvore.inserir("Bruno");
        arvore.inserir("Carla");
        
        System.out.println("Inserindo nomes repetidos: Ana, João");
        arvore.inserir("Ana");
        arvore.inserir("João");
        arvore.inserir("João"); 

        System.out.println();

        arvore.mostrarInformacoes();

        arvore.listarEmOrdem();

        arvore.listarReversa();

        System.out.println("TESTES DE BUSCA");
        testarBusca(arvore, "João");
        testarBusca(arvore, "Lucas");
        testarBusca(arvore, "Ana");
        testarBusca(arvore, "Pedro");
        testarBusca(arvore, "Zeca");
    }

    private static void testarBusca(arvoreNomes arvore, String nome) {
        boolean encontrado = arvore.buscar(nome);
        System.out.println("Buscando '" + nome + "': " + 
                          (encontrado ? "ENCONTRADO" : "NÃO ENCONTRADO"));
    }
}
