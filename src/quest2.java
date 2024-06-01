import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando as notas do aluno
        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        // Solicitando a letra para o tipo de média
        System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
        char tipoMedia = scanner.next().charAt(0);

        // Chamando a função para calcular a média
        float media = calcularMedia(nota1, nota2, nota3, tipoMedia);

        // Exibindo o resultado
        System.out.println("A média calculada é: " + media);

        scanner.close();
    }

    // Função para calcular a média
    public static float calcularMedia(float nota1, float nota2, float nota3, char tipoMedia) {
        float media;

        if (tipoMedia == 'A' || tipoMedia == 'a') {
            // Calculando a média aritmética
            media = (nota1 + nota2 + nota3) / 3;
        } else if (tipoMedia == 'P' || tipoMedia == 'p') {
            // Calculando a média ponderada com pesos 5, 3 e 2
            media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
        } else {
            // Tipo de média inválido, retornando 0
            System.out.println("Tipo de média inválido. Retornando 0.");
            media = 0;
        }

        return media;
    }
}
