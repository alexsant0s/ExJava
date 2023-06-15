
/*Faça um algoritmo que calcule a média dos elementos
 da diagonal principal de uma matriz 10X10 de inteiros.*/
import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        int tamanhoMatriz = 5; // Define o tamanho da matriz como 5
        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz]; // Declara uma matriz bidimensional de inteiros com
                                                                // tamanho 5x5
        Ex11.preencheMatrizAleatorio(matriz); // Chama o método 'preencheMatrizAleatorio' da classe Ex11, passando a
                                              // matriz como argumento
        calculaMediaDiagonal(matriz); // Chama o método 'calculaMediaDiagonal' passando a matriz como argumento
    }

    public static void calculaMediaDiagonal(int[][] matriz) {
        Random r = new Random(); // Cria um objeto Random para gerar números aleatórios
        int somamed = 0; // Variável para armazenar a soma dos elementos da diagonal
        for (int l = 0; l < matriz[0].length; l++) { // Loop que itera sobre as linhas da matriz
            System.out.println();
            for (int c = 0; c < matriz[0].length; c++) { // Loop que itera sobre as colunas da matriz
                matriz[l][c] = r.nextInt(10); // Atribui um número aleatório ao elemento da matriz
                System.out.print("|" + matriz[l][c] + "|");
                if (l == c) { // Verifica se o índice da linha é igual ao índice da coluna (diagonal
                              // principal)
                    somamed += matriz[l][c]; // Soma o elemento da diagonal principal
                }
            }
        }
        System.out.println("\nA média dos elementos da diagonal dessa matriz é: " + (float) somamed / matriz[0].length);
    }
}
