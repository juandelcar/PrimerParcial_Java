import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el MAXIMO COMUN DIVISOR de dos números");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer Valor:");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo Valor:");
            int num2 = scanner.nextInt();

            int mcd = calcularMCD(num1, num2);
            System.out.println("El Máximo Común Divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);
        }
    }

 public static int calcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
