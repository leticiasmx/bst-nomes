package bstnomes;

class node {
    String nome;
    node esquerda, direita;
    int contador; 

    node(String nome) {
        this.nome = nome;
        this.contador = 1; 
    }
}
