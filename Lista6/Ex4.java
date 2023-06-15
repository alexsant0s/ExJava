
/*Construa um programa para ler dois valores e mostrar o maior deles.*/
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int v1, v2; // Declara duas variáveis do tipo inteiro v1 e v2
        Scanner input = new Scanner(System.in); // Cria uma instância do Scanner para ler a entrada do usuário
        System.out.print("Digite um número inteiro: "); // Imprime uma mensagem para o usuário
        v1 = input.nextInt(); // Lê o valor inteiro digitado pelo usuário e atribui à variável v1
        System.out.print("Digite outro número inteiro: "); // Imprime uma mensagem para o usuário
        v2 = input.nextInt(); // Lê o valor inteiro digitado pelo usuário e atribui à variável v2
        if (v1 == v2) { // Verifica se v1 é igual a v2
            System.out.println("Você digitou dois números iguais!"); // Imprime uma mensagem informando que os números
                                                                     // são iguais
        } else {
            int maior = verificaMaior(v1, v2); // Chama o método 'verificaMaior' passando v1 e v2 como argumentos e
                                               // armazena o resultado na variável 'maior'
            System.out.println("O maior número é " + maior); // Imprime o maior número
        }
        input.close(); // Fecha o Scanner para liberar recursos
    }

    public static int verificaMaior(int a, int b) {
        int maior; // Declara uma variável inteira 'maior'
        if (a > b) { // Verifica se a é maior que b
            maior = a; // Atribui a à variável 'maior' se a for maior que b
        } else {
            maior = b; // Atribui b à variável 'maior' se b for maior que a ou igual a a
        }
        return maior; // Retorna o maior valor entre a e b
    }
}
