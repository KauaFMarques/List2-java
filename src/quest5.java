import java.util.Scanner;

class Filme {
    String nome;
    String autor;
    int ano;
    double preco;

    // Método para ler os dados do filme
    public void lerDados(Scanner scanner) {
        System.out.print("Digite o nome do filme: ");
        this.nome = scanner.nextLine();
        System.out.print("Digite o autor do filme: ");
        this.autor = scanner.nextLine();
        System.out.print("Digite o ano do filme: ");
        this.ano = scanner.nextInt();
        System.out.print("Digite o preço do filme: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
    }

    // Método para imprimir os dados do filme
    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);
    }
}

public class quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar array para armazenar três filmes
        Filme[] filmes = new Filme[3];

        // Ler os dados dos três filmes
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDigite os dados do filme " + (i + 1) + ":");
            filmes[i] = new Filme();
            filmes[i].lerDados(scanner);
        }

        // Imprimir os dados dos três filmes
        System.out.println("\nDados dos filmes cadastrados:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nFilme " + (i + 1) + ":");
            filmes[i].imprimirDados();
        }

        scanner.close();
    }
}
