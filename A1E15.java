import java.util.Scanner;

public class A1E15 {
    public static void main(String args[]) {
        int Numero1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        Numero1 = scanner.nextInt();
        if (Numero1 > 0) {
            System.out.println("El numero ingresado es positivo");
        }
        if (Numero1 < 0) {
            System.out.println("El numero ingresado es negativo");
        }
        if (Numero1 == 0) {
            System.out.println("El numero ingresado es nulo");
        }
    }
}