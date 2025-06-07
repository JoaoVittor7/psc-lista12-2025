package atividadesfaculdade;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);

        System.out.println("Informe o comprimento do local (em metros):");
        double comprimento = computador.nextDouble();

        System.out.println("Informe a largura do local (em metros):");
        double largura = computador.nextDouble();

        Retangulo local = new Retangulo(comprimento, largura);

        double area = local.calcularArea();
        double perimetro = local.calcularPerimetro();

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Área do local: %.2f m²%n", area);
        System.out.printf("Quantidade de pisos necessária: %.2f unidades%n", area);
        System.out.printf("Perímetro do local: %.2f metros%n", perimetro);

        computador.close();
    }
}