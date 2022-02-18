import java.util.Scanner;

public class A1E14 {
    public static void main(String args[]) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el num1 ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el num2: ");
        num2 = scanner.nextInt();
        System.out.println();
        if(num1%num2==0){
            System.out.println("El numero 2 es divisible dentro del primero");
        } else {
            System.out.println("El numero 2 no es divisible dentro del primero");
        }
    }
}
