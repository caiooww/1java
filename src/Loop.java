import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNotas = 0;
        double nota = 0;
        int totalNotas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do filme: ");
            nota = leitura.nextDouble();
            mediaNotas +=  nota;
            totalNotas++;
        }

        System.out.printf("A média das notas é:"+ mediaNotas / totalNotas);
        }

}
