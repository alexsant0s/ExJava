
/*Construa um programa para ler um valor, verificar se é par ou ímpar e mostrar essa informação. 
(DICA: Usar if/else e o operador aritmético % para mostrar se
valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)*/
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria uma instância do Scanner para ler a entrada do usuário
        float valor; // Declara uma variável do tipo float chamada 'valor'
        System.out.print("Digite um valor: "); // Imprime uma mensagem para o usuário
        valor = input.nextFloat(); // Lê o valor digitado pelo usuário e atribui à variável 'valor'
        if (verificaPar(valor) == true) { // Chama o método 'verificaPar' passando o valor como argumento e verifica se
                                          // o retorno é verdadeiro
            System.out.println("O número é Par!"); // Imprime uma mensagem informando que o número é par
        } else {
            System.out.println("O número é Ímpar!"); // Imprime uma mensagem informando que o número é ímpar
        }
        input.close(); // Fecha o Scanner para liberar recursos
    }

    public static boolean verificaPar(float a) {
        if (a % 2 == 0) { // Verifica se o número é divisível por 2, ou seja, se é par
            return true; // Retorna verdadeiro se o número for par
        } else {
            return false; // Retorna falso se o número for ímpar
        }
    }
}
