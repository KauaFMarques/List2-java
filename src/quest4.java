import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a string do usuário
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        while (true) {
            // Exibir o menu
            System.out.println("\nEscolha uma opção:");
            System.out.println("a) O número de caracteres da string.");
            System.out.println("b) A String com todas suas letras em maiúsculo.");
            System.out.println("c) A String com todas suas letras em minúsculo.");
            System.out.println("d) O número de vogais da string.");
            System.out.println("e) Se a String digitada começa com “UE” (ignorando maiúsculas/minúsculas).");
            System.out.println("f) Imprimir a String de maneira inversa.");
            System.out.println("g) Sair.");

            char opcao = scanner.nextLine().charAt(0);

            switch (opcao) {
                case 'a':
                    System.out.println("Número de caracteres da string: " + inputString.length());
                    break;
                case 'b':
                    System.out.println("String em maiúsculas: " + inputString.toUpperCase());
                    break;
                case 'c':
                    System.out.println("String em minúsculas: " + inputString.toLowerCase());
                    break;
                case 'd':
                    System.out.println("Número de vogais: " + contarVogais(inputString));
                    break;
                case 'e':
                    if (inputString.toLowerCase().startsWith("ue")) {
                        System.out.println("A string começa com 'UE'.");
                    } else {
                        System.out.println("A string não começa com 'UE'.");
                    }
                    break;
                case 'f':
                    System.out.println("String invertida: " + new StringBuilder(inputString).reverse().toString());
                    break;
                case 'g':
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

    // Método para contar o número de vogais em uma string
    public static int contarVogais(String str) {
        int count = 0;
        String vogais = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
