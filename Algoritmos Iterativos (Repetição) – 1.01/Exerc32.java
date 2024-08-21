import java.util.Scanner;

public class itera32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os primeiros 9 dígitos do CPF:");
        String cpf = scanner.nextLine();

        if (cpf.length() != 9 || !cpf.matches("\\d+")) {
            System.out.println("CPF inválido. Insira exatamente 9 dígitos!!!");
            scanner.close();
            return;
        }

        int primeiroDigito = calcularPrimeiroDigito(cpf);

        int segundoDigito = calcularSegundoDigito(cpf, primeiroDigito);

        System.out.println("Os dígitos verificadores são: " + primeiroDigito + segundoDigito);
        
    }

    public static int calcularPrimeiroDigito(String cpf) {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * Character.getNumericValue(cpf.charAt(i));
        }

        int resto = soma % 11;
        if (resto == 0 || resto == 1) {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    public static int calcularSegundoDigito(String cpf, int primeiroDigito) {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (11 - i) * Character.getNumericValue(cpf.charAt(i));
        }
        soma += 2 * primeiroDigito;

        int resto = soma % 11;
        if (resto == 0 || resto == 1) {
            return 0;
        } else {
            return 11 - resto;
        }
    }
}
