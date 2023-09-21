import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del limite inferior:");
            int lim_inf = scanner.nextInt();
            

            System.out.println("Ingrese el valor del limite superior:");
            int lim_sup = scanner.nextInt();

            int sumatoria = calcularSumatoria(lim_inf, lim_sup);

            System.out.println("La sumatoria de los cuadrados es: " + sumatoria);
        }
    }

    private static int calcularSumatoria(int lim_inf, int lim_sup) {
        if (lim_inf > lim_sup) {
            return 0;
        } else {
            int cuadrado = lim_inf * lim_inf;
            return cuadrado + calcularSumatoria(lim_inf + 1, lim_sup);
        }
    }
}
