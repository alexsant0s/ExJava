
/*Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9, 
imprima a matriz e calcule 
e imprima a soma dos seus elementos.*/
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][9]; // Declara uma matriz bidimensional de inteiros com 7 linhas e 9 colunas
        preencheMatrizEsoma(matriz); // Chama o método 'preencheMatrizEsoma' passando a matriz como argumento
    }

    public static void preencheMatrizEsoma(int[][] matriz) {
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios
        int soma = 0; // Variável para armazenar a soma dos elementos da matriz
        System.out.print("\n___________________________________"); // Imprime uma linha de separação
        for (int l = 0; l < matriz.length; l++) { // Loop que itera sobre as linhas da matriz
            System.out.println(""); // Imprime uma quebra de linha
            for (int c = 0; c < matriz[0].length; c++) { // Loop que itera sobre as colunas da matriz
                matriz[l][c] = random.nextInt(10, 100); // Atribui um número aleatório entre 10 e 99 ao elemento da
                                                        // matriz
                soma += matriz[l][c]; // Adiciona o elemento atual à variável soma
                System.out.print("|" + matriz[l][c] + "|"); // Imprime o elemento da matriz entre barras verticais
            }
        }
        System.out.print("\n|            Soma= " + soma + "            |"); // Imprime a soma dos elementos
        System.out.print("\n|__________________________________|"); // Imprime uma linha de separação
    }
}
