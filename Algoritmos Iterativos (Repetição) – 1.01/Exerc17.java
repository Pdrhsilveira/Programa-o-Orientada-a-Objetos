import java.util.Scanner;

public class itera17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int fibonacciCount = 0;

        while (true) {
            System.out.println("Informe um número (negativo para sair):");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            count++;

            if (ehFibonacci(num)) {
                fibonacciCount++;
            }
        }

        scanner.close();

        if (count > 0) {
            double porcentagem = (fibonacciCount * 100.0) / count;
            System.out.printf("Percentual de números que são Fibonacci: %.2f%%\n", porcentagem);
        } else {
            System.out.println("Nenhum número foi informado!!");
        }
    }

    public static boolean ehFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}
