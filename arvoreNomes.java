package bstnomes;

class arvoreNomes {
    private node raiz;
    private int totalNomes; 

    public arvoreNomes() {
        this.raiz = null;
        this.totalNomes = 0;
    }

    public void inserir(String nome) {
        raiz = inserirRecursivo(raiz, nome);
    }

    private node inserirRecursivo(node no, String nome) {
        if (no == null) {
            totalNomes++;
            return new node(nome);
        }

        int comparacao = nome.compareToIgnoreCase(no.nome);

        if (comparacao < 0) {
            no.esquerda = inserirRecursivo(no.esquerda, nome);
        } else if (comparacao > 0) {
            no.direita = inserirRecursivo(no.direita, nome);
        } else {
            no.contador++;
            totalNomes++;
        }

        return no;
    }
    public void listarEmOrdem() {
        System.out.println("Nomes em ordem alfabética:");
        listarEmOrdemRecursivo(raiz);
        System.out.println();
    }

    private void listarEmOrdemRecursivo(node no) {
        if (no != null) {
            listarEmOrdemRecursivo(no.esquerda);
            System.out.println(no.nome + (no.contador > 1 ? " (" + no.contador + "x)" : ""));
            listarEmOrdemRecursivo(no.direita);
        }
    }
    public boolean buscar(String nome) {
        return buscarRecursivo(raiz, nome);
    }

    private boolean buscarRecursivo(node no, String nome) {
        if (no == null) {
            return false;
        }

        int comparacao = nome.compareToIgnoreCase(no.nome);

        if (comparacao < 0) {
            return buscarRecursivo(no.esquerda, nome);
        } else if (comparacao > 0) {
            return buscarRecursivo(no.direita, nome);
        } else {
            return true; 
        }
    }

    public void listarReversa() {
        System.out.println("Nomes em ordem decrescente:");
        listarReversaRecursivo(raiz);
        System.out.println();
    }

    private void listarReversaRecursivo(node no) {
        if (no != null) {
            listarReversaRecursivo(no.direita);
            System.out.println(no.nome + (no.contador > 1 ? " (" + no.contador + "x)" : ""));
            listarReversaRecursivo(no.esquerda);
        }
    }

    public int contarNomes() {
        return totalNomes;
    }

    public int contarNosUnicos() {
        return contarNosUnicosRecursivo(raiz);
    }

    private int contarNosUnicosRecursivo(node no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNosUnicosRecursivo(no.esquerda) + contarNosUnicosRecursivo(no.direita);
    }

    public void mostrarInformacoes() {
        System.out.println("INFORMAÇÕES DA ÁRVORE");
        System.out.println("Total de nomes armazenados: " + contarNomes());
        System.out.println("Nós únicos na árvore: " + contarNosUnicos());
    }
}
