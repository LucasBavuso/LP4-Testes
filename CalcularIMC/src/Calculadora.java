import java.util.Scanner;
import java.util.Locale;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite seu peso em kg (ex: 70.5): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite sua altura em metros (ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
            char entradaSexo = scanner.next().toUpperCase().charAt(0);

            boolean sexoMasculino;
            if (entradaSexo == 'M') {
                sexoMasculino = true;
            } else if (entradaSexo == 'F') {
                sexoMasculino = false;
            } else {
                System.out.println("Sexo inválido. Por favor, use M ou F.");
                continue;
            }

            double imc = peso / (altura * altura);
            System.out.println("------------------------------------");
            System.out.printf("Seu IMC é: %.2f%n", imc);

            String condicao;
            if (!sexoMasculino) {
                if (imc < 19.1) {
                    condicao = "Abaixo do peso";
                } else if (imc < 25.8) {
                    condicao = "No peso normal";
                } else if (imc < 27.3) {
                    condicao = "Marginalmente acima do peso";
                } else if (imc < 32.3) {
                    condicao = "Acima do peso ideal";
                } else {
                    condicao = "Obeso";
                }
            } else {
                if (imc < 20.7) {
                    condicao = "Abaixo do peso";
                } else if (imc < 26.4) {
                    condicao = "No peso normal";
                } else if (imc < 27.8) {
                    condicao = "Marginalmente acima do peso";
                } else if (imc < 31.1) {
                    condicao = "Acima do peso ideal";
                } else {
                    condicao = "Obeso";
                }
            }

            System.out.println("Condição: " + condicao);
            System.out.println("------------------------------------");

            System.out.print("Deseja calcular outro IMC? (S/N): ");
            char opcao = scanner.next().toUpperCase().charAt(0);

            if (opcao == 'N') {
                continuar = false;
                System.out.println("Programa finalizado!");
            }
        }

        scanner.close();
    }
}
