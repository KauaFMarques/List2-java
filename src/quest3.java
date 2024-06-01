import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler as duas strings do usuário
        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();
        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        // Verificar se as strings são iguais
        if (string1.equals(string2)) {
            System.out.println("strings iguais");
        } else {
            // Concatenar as strings se forem diferentes
            String concatenacao = string1 + string2;
            System.out.println("String resultante: " + concatenacao);
        }

        scanner.close();
    }
}
