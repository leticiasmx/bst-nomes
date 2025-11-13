# BST Nomes - Árvore Binária de Busca para Nomes
Uma implementação em Java de uma Árvore Binária de Busca (BST) especializada em armazenar e gerenciar nomes de pessoas em ordem alfabética.

# 📋 Descrição
Este projeto implementa uma árvore binária de busca eficiente para armazenamento e organização de nomes, com funcionalidades completas de inserção, busca e listagem em diferentes ordens. A implementação utiliza comparações adequadas de Strings em Java através do método compareTo().

# ✨ Funcionalidades
✅ Inserção de nomes - Armazena nomes mantendo a ordem alfabética

✅ Listagem em ordem alfabética - Percurso in-order

✅ Listagem em ordem decrescente - Percurso reverso (Z → A)

✅ Busca eficiente - Verifica se um nome existe na árvore

✅ Contagem de nomes - Total de nomes armazenados (incluindo repetições)

✅ Suporte a nomes repetidos - Conta ocorrências de cada nome

✅ Case-insensitive - Comparações que ignoram maiúsculas/minúsculas


# 📦 Classes Principais
node
Representa um nó da árvore binária:

String nome - O nome armazenado

No esquerda, direita - Referências para os filhos

int contador - Contador de repetições do nome

arvoreNomes
Classe principal com os métodos:

inserir(String nome) - Adiciona um nome à árvore

listarEmOrdem() - Lista nomes em ordem alfabética

listarReversa() - Lista em ordem decrescente

buscar(String nome) - Verifica se nome existe

contarNomes() - Retorna total de nomes


# 🔧 Tecnologias Utilizadas
Java - Linguagem de programação

Estruturas de Dados - Árvore Binária de Busca (BST)

Algoritmos - Percursos in-order, pré-order e pós-order

# 🎯 Objetivos de Aprendizado
Este projeto foi desenvolvido para praticar:

Implementação de árvores binárias de busca

Comparação de Strings em Java com compareTo()

Algoritmos de busca e ordenação

Manipulação de estruturas de dados recursivas

Boas práticas de orientação a objetos

# 📝 Notas de Implementação
Comparação de Strings: Usa compareToIgnoreCase() para ordenação alfabética case-insensitive

Nomes Repetidos: São contados no mesmo nó, incrementando um contador

Eficiência: Operações de busca, inserção e remoção com complexidade O(log n) em árvores balanceadas



contarNosUnicos() - Retorna nós distintos

