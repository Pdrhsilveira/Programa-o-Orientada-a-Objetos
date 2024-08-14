import java.util.Scanner;

public class Lis01Exer04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Digite o valor do lado a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor do lado b:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor do ângulo em graus:");
        double anguloGraus = scanner.nextDouble();

        scanner.close();

        double anguloRadianos = Math.toRadians(anguloGraus);

        double area = (a * b * Math.sin(anguloRadianos)) / 2;

        System.out.printf("A área do triângulo é: %.2f", area);
    }
}
