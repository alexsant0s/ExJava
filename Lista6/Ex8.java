
/*Ler um vetor X de 10 elementos (ler pelo teclado os 10 elementos do tipo inteiro).
Crie um vetor Y da seguinte forma: 
(a) os elementos de ordem par de Y (elementos com índice 0, 2, 4, 6, 8) 
    receberão os respectivos elementos de X multiplicados por 2;
(b) Os elementos de ordem ímpar de Y (elementos com índices 1, 3, 5, 7, 9)
    receberão os respectivos elementos de X multiplicados por 3. Escrever o vetor Y. */
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int[] X = new int[10]; // Declara um vetor de inteiros chamado X com tamanho 10
        int[] Y = new int[10]; // Declara um vetor de inteiros chamado Y com tamanho 10
        inputPreencheVetor(X); // Chama o método 'inputPreencheVetor' passando o vetor X como argumento
        preencheVetorX2(X, Y); // Chama o método 'preencheVetorX2' passando os vetores X e Y como argumentos
        Ex6.imprimirVetor(Y); // Chama o método 'imprimirVetor' da classe Ex6, passando o vetor Y como
                              // argumento
    }

    public static void inputPreencheVetor(int[] vetor) {
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        for (int i = 0; i < vetor.length; i++) { // Loop que itera sobre os índices do vetor
            System.out.printf("Digite o %d° número: ", i + 1); // Solicita ao usuário que digite um número
            vetor[i] = input.nextInt(); // Lê o número digitado pelo usuário e atribui ao elemento do vetor
        }
        input.close(); // Fecha o Scanner para liberar recursos
    }

    public static void preencheVetorX2(int[] vetorA, int[] vetorB) {
        for (int i = 0; i < vetorA.length; i++) { // Loop que itera sobre os índices do vetorA
            if (i % 2 == 0) { // Verifica se o índice é par
                vetorB[i] = vetorA[i] * 2; // Multiplica o elemento do vetorA por 2 e atribui ao elemento correspondente
                                           // do vetorB
            } else {
                vetorB[i] = vetorA[i] * 3; // Multiplica o elemento do vetorA por 3 e atribui ao elemento correspondente
                                           // do vetorB
            }
        }
    }
}
