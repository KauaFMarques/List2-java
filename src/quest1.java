import java.util.Scanner;
public class quest1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // Solicitando um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chamando a função para verificar se o número é par ou ímpar
        int resultado = verificarParidade(numero);

        // Exibindo o resultado
        if (resultado == 1) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }

    // Função para verificar se um número é par ou ímpar
    public static int verificarParidade(int numero) {
        if (numero % 2 == 0) {
            return 1; // Número é par
        } else {
            return 0; // Número é ímpar
        }
    }
}
