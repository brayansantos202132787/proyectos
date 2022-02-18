import java.util.Scanner;

public class A1E16 {
    public static void main(String args[]) {
        int numero1;
        int numero2;
        int numero3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero1 ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el numero2: ");
        numero2 = scanner.nextInt();
        System.out.println("Ingrese el numero3: ");
        numero3 = scanner.nextInt();
        if (numero1 > numero2&&numero1>numero3) {
            System.out.println("El numero "+ numero1+ " es el numero mayor");
        } else if (numero2>numero1&&numero2>numero3){
            System.out.println("El numero "+ numero2+ " es el numero mayor");
        } else {
            System.out.println("El numero "+ numero3+ " es el numero mayor");
        }
    }
}