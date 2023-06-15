
/* Construa um algoritmo que leia (via teclado) dois números do tipo inteiro, 
calcule o produto entre eles e mostre o resultado. */
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt(); // Lê o primeiro número digitado pelo usuário e armazena na variável numero1

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt(); // Lê o segundo número digitado pelo usuário e armazena na variável numero2

        int produto = calcularProduto(numero1, numero2); // Chama o método calcularProduto passando os dois números como
                                                         // argumento e armazena o resultado na variável produto

        System.out.println("O produto dos números é: " + produto); // Imprime o resultado do produto dos números

        scanner.close(); // Fecha o Scanner para liberar recursos
    }

    public static int calcularProduto(int a, int b) {
        return a * b; // Retorna o produto dos dois números
    }
}
