import java.util.Scanner;

public class itera24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPerfeitos = 0;
        int menorPerfeito = Integer.MAX_VALUE;

        while (countPerfeitos < 10) {
            System.out.println("Informe um número:");
            int num = scanner.nextInt();

            if (isPerfect(num)) {
                countPerfeitos++;
                if (num < menorPerfeito) {
                    menorPerfeito = num;
                }
            }
        }

        scanner.close();

        System.out.println("O menor número perfeito informado foi: " + menorPerfeito);
    }

    public static boolean isPerfect(int n) {
        int somaDivisores = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == n;
    }
}
