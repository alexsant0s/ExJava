
/*Dada uma matriz M[1..6][1..8] criada randomicamente, 
criar um vetor C que contenha em cada posição a quantidade de elementos negativos da linha correspondente de M. 
Tamanho de C igual ao número de linhas da matriz.*/
import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        int[][] M = new int[6][8]; // Declara uma matriz bidimensional de inteiros com 6 linhas e 8 colunas
        int[] C = new int[6]; // Declara um vetor unidimensional de inteiros com tamanho 6
        preencheMatrizAleatorio(M); // Chama o método 'preencheMatrizAleatorio' passando a matriz como argumento
        preencheVetorElementosNegativos(M, C); // Chama o método 'preencheVetorElementosNegativos' passando a matriz e o
                                               // vetor como argumentos
    }

    public static void preencheMatrizAleatorio(int[][] matriz) {
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios
        for (int l = 0; l < matriz.length; l++) { // Loop que itera sobre as linhas da matriz
            for (int c = 0; c < matriz[0].length; c++) { // Loop que itera sobre as colunas da matriz
                matriz[l][c] = random.nextInt(); // Atribui um número aleatório ao elemento da matriz
            }
        }
    }

    public static void preencheVetorElementosNegativos(int[][] matriz, int[] vetor) {
        for (int i = 0; i < matriz.length; i++) { // Loop que itera sobre as linhas da matriz
            int cont = 0; // Variável para contar o número de elementos negativos
            for (int x = 0; x < matriz[0].length; x++) { // Loop que itera sobre as colunas da matriz
                if (matriz[i][x] < 0) { // Verifica se o elemento é negativo
                    cont += 1; // Incrementa o contador
                }
            }
            vetor[i] = cont; // Armazena a contagem no vetor
            System.out.printf("\n%dº Linha tem %d números negativos", i + 1, cont); // Imprime a contagem de números
                                                                                    // negativos na linha
        }
    }
}
