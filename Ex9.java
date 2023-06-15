/*Faça um programa que leia dois vetores (A e B) de tamanhoVetor posições
e crie um terceiro (C) com a intersecção dos dois primeiros,
isto é, coloque em C apenas os elementos que coexistem em A e B. Mostre C.*/

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        int tamanhoVetor = 5; // Define o tamanho do vetor como 5
        int[] A = new int[tamanhoVetor]; // Declara um vetor de inteiros chamado A com tamanho 5
        int[] B = new int[tamanhoVetor]; // Declara um vetor de inteiros chamado B com tamanho 5
        int[] C = new int[tamanhoVetor]; // Declara um vetor de inteiros chamado C com tamanho 5
        preencherVetorAleatorio(A); // Chama o método 'preencherVetorAleatorio' passando o vetor A como argumento
        preencherVetorAleatorio(B); // Chama o método 'preencherVetorAleatorio' passando o vetor B como argumento
        Ex6.imprimirVetor(A); // Chama o método 'imprimirVetor' da classe Ex6, passando o vetor A como
                              // argumento
        Ex6.imprimirVetor(B); // Chama o método 'imprimirVetor' da classe Ex6, passando o vetor B como
                              // argumento
        interserccaoVetores(A, B, C); // Chama o método 'interserccaoVetores' passando os vetores A, B e C como
                                      // argumentos
        Ex6.imprimirVetor(C); // Chama o método 'imprimirVetor' da classe Ex6, passando o vetor C como
                              // argumento
    }

    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios
        for (int i = 0; i < vetor.length; i++) { // Loop que itera sobre os índices do vetor
            vetor[i] = random.nextInt(100); // Atribui um número aleatório entre 0 e 99 ao elemento do vetor
        }
    }

    public static void interserccaoVetores(int[] vetorA, int[] vetorB, int[] vetorC) {
        for (int i = 0; i < vetorC.length; i++) { // Loop que itera sobre os índices do vetorC
            for (int x = 0; x < vetorA.length; x++) { // Loop que itera sobre os índices do vetorA
                if (vetorA[x] == vetorB[i]) { // Verifica se o elemento do vetorA é igual ao elemento do vetorB na mesma
                                              // posição
                    vetorC[i] = vetorA[x]; // Atribui o elemento do vetorA ao elemento correspondente do vetorC
                }
            }
        }
    }
}
