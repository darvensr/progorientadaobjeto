import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = scanner.nextDouble();
        }

        double resistenciaEquivalente = 0;
        double maior = resistencias[0];
        double menor = resistencias[0];

        for (double resistencia : resistencias) {
            resistenciaEquivalente += resistencia;
            if (resistencia > maior) maior = resistencia;
            if (resistencia < menor) menor = resistencia;
        }

        System.out.println("Resistência equivalente: " + resistenciaEquivalente + " ohms");
        System.out.println("Maior resistência: " + maior + " ohms");
        System.out.println("Menor resistência: " + menor + " ohms");

        scanner.close();
    }
}
