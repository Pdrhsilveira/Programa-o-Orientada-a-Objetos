import java.util.Scanner;

public class Lis01Exer12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial aplicado:");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Digite o percentual de juros mensal:");
        double percentualJuros = scanner.nextDouble();

        System.out.println("Digite a quantidade de meses:");
        int nMeses = scanner.nextInt();

        scanner.close();

        double saldoFinal = saldoInicial * Math.pow(1 + (percentualJuros / 100), nMeses);

        System.out.printf("O saldo final após %d meses é: %.2f", nMeses, saldoFinal);
    }
}
