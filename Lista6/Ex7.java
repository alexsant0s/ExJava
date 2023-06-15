/*Escreva um programa que leia dois vetores (A e B) de 10 posições
e faça a multiplicação dos elementos de mesmo índice em ambos os vetores colocando 
o resultado em um terceiro vetor (C). 
Mostre o vetor resultante */
public class Ex7 {
    public static void main(String[] args) {
        int[] A = new int[10]; // Declara um vetor de inteiros chamado A com tamanho 10
        int[] B = new int[10]; // Declara um vetor de inteiros chamado B com tamanho 10
        int[] C = new int[10]; // Declara um vetor de inteiros chamado C com tamanho 10
        Ex6.preencherVetor(A); // Chama o método 'preencherVetor' da classe Ex6, passando o vetor A como
                               // argumento
        Ex6.preencherVetor(B); // Chama o método 'preencherVetor' da classe Ex6, passando o vetor B como
                               // argumento
        multiplicaIndice(A, B, C); // Chama o método 'multiplicaIndice' passando os vetores A, B e C como
                                   // argumentos
    }

    public static void multiplicaIndice(int[] vetorA, int[] vetorB, int vetorC[]) {
        for (int i = 0; i < vetorC.length; i++) { // Loop que itera sobre os índices do vetor C
            vetorC[i] = vetorA[i] * vetorB[i]; // Multiplica os elementos correspondentes dos vetores A e B e atribui o
                                               // resultado ao vetor C na mesma posição
            System.out.printf("\n%dA= %d\n%dB= %d\n%d X %d = %d\n", i + 1, vetorA[i], i + 1, vetorB[i], vetorA[i],
                    vetorB[i], vetorC[i]); // Imprime os elementos dos vetores A, B e C, bem como a multiplicação
                                           // realizada
            System.out.println("************"); // Imprime uma linha de separação
        }
    }
}
