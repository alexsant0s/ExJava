/*Preencher um vetor B de 10 elementos em tempo de execução com o
número 10 se o índice do elemento for ímpar, e com o número 20 se for par. 
Escrever o vetor B após o seu total preenchimento. */
public class Ex6 {
    public static void main(String[] args) {
        int[] B = new int[10]; // Declara um vetor de inteiros chamado B com tamanho 10
        preencherVetor(B); // Chama o método 'preencherVetor' passando o vetor B como argumento
        imprimirVetor(B); // Chama o método 'imprimirVetor' passando o vetor B como argumento
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) { // Loop que itera sobre os índices do vetor
            if (i % 2 == 0) { // Verifica se o índice é par
                vetor[i] = 20; // Preenche o elemento do vetor com o valor 20 se o índice for par
            } else {
                vetor[i] = 10; // Preenche o elemento do vetor com o valor 10 se o índice for ímpar
            }
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) { // Loop que itera sobre os índices do vetor
            System.out.println("Índice[" + i + "] = " + vetor[i]); // Imprime o índice e o valor correspondente do vetor
        }
    }
}
