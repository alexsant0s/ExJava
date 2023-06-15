
/*/Construa um algoritmo para ler (via teclado) quatro números do tipo inteiro,
calcular e mostrar a média aritmética entre eles. */
import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {

        int[] variaveis = new int[4]; // Declara um array de inteiros chamado 'variaveis' com tamanho 4
        Scanner input = new Scanner(System.in); // Cria uma instância do Scanner para ler a entrada do usuário
        System.out.println("Digite quatro números e direi sua soma e sua média!"); // Imprime uma mensagem para o
                                                                                   // usuário
        for (int i = 0; i < 4; i++) { // Loop que itera 4 vezes
            System.out.printf("Digite o %d° número: ", i + 1); // Imprime a mensagem solicitando ao usuário para digitar
                                                               // o i+1-ésimo número
            variaveis[i] = input.nextInt(); // Lê o número digitado pelo usuário e armazena no array 'variaveis'
        }
        double media = calculaMedia(variaveis[0], variaveis[1], variaveis[2], variaveis[3]); // Chama o método
                                                                                             // 'calculaMedia' passando
                                                                                             // os números armazenados
                                                                                             // no array 'variaveis'
                                                                                             // como argumentos e
                                                                                             // armazena o resultado na
                                                                                             // variável 'media'
        System.out.println("A média dos números é: " + media); // Imprime a média dos números

        input.close(); // Fecha o Scanner para liberar recursos
    }

    public static double calculaMedia(int a, int b, int c, int d) {
        return (double) (a + b + c + d) / 4; // Calcula a média dos quatro números e retorna o valor como um double
    }
}
