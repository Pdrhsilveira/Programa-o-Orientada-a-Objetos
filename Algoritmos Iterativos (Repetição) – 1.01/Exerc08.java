import java.util.Scanner;

public class SomaDosN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();

        scanner.close();

       int contador = 0;
       int soma = 0;

       while (contador < numero){
        contador++;
        soma = soma + contador;

       }
       System.out.println(soma);

    }
}
