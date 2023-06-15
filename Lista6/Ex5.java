
/*Crie um programa em Java que receba do usuário um número inteiro positivo 
e informe os totais de números pares e ímpares encontrados entre 1 e o número digitado
 + o somatório dos pares e ímpares separadamente */
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt(); // Lê o número inteiro digitado pelo usuário e atribui à variável 'numero'

        int totalPares = contarPares(numero); // Chama o método 'contarPares' passando o número como argumento e
                                              // armazena o resultado na variável 'totalPares'
        int totalImpares = contarImpares(numero); // Chama o método 'contarImpares' passando o número como argumento e
                                                  // armazena o resultado na variável 'totalImpares'
        int somaPares = somarPares(numero); // Chama o método 'somarPares' passando o número como argumento e armazena o
                                            // resultado na variável 'somaPares'
        int somaImpares = somarImpares(numero); // Chama o método 'somarImpares' passando o número como argumento e
                                                // armazena o resultado na variável 'somaImpares'

        System.out.println("Total de números pares: " + totalPares); // Imprime o total de números pares
        System.out.println("Total de números ímpares: " + totalImpares); // Imprime o total de números ímpares
        System.out.println("Soma dos números pares: " + somaPares); // Imprime a soma dos números pares
        System.out.println("Soma dos números ímpares: " + somaImpares); // Imprime a soma dos números ímpares
        input.close(); // Fecha o Scanner para liberar recursos
    }

    public static int contarPares(int numero) {
        int contador = 0; // Inicializa um contador para contar os números pares
        for (int i = 1; i <= numero; i++) { // Loop que itera de 1 até o número
            if (i % 2 == 0) { // Verifica se o número é par
                contador++; // Incrementa o contador se o número for par
            }
        }
        return contador; // Retorna o total de números pares
    }

    public static int contarImpares(int numero) {
        int contador = 0; // Inicializa um contador para contar os números ímpares
        for (int i = 1; i <= numero; i++) { // Loop que itera de 1 até o número
            if (i % 2 != 0) { // Verifica se o número é ímpar
                contador++; // Incrementa o contador se o número for ímpar
            }
        }
        return contador; // Retorna o total de números ímpares
    }

    public static int somarPares(int numero) {
        int soma = 0; // Inicializa uma variável para armazenar a soma dos números pares
        for (int i = 1; i <= numero; i++) { // Loop que itera de 1 até o número
            if (i % 2 == 0) { // Verifica se o número é par
                soma += i; // Adiciona o número à soma se ele for par
            }
        }
        return soma; // Retorna a soma dos números pares
    }

    public static int somarImpares(int numero) {
        int soma = 0; // Inicializa uma variável para armazenar a soma dos números ímpares
        for (int i = 1; i <= numero; i++) { // Loop que itera de 1 até o número
            if (i % 2 != 0) { // Verifica se o número é ímpar
                soma += i; // Adiciona o número à soma se ele for ímpar
            }
        }
        return soma; // Retorna a soma dos números ímpares
    }
}