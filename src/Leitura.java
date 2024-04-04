import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento?");
        int ano = leitura.nextInt();
        System.out.println("Qual sua nota de 0 a 5 para o filne?");
        double nota = leitura.nextDouble();

        System.out.println("Seu filme favorito é: " + filme);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Nota: " + nota);
    }
}
