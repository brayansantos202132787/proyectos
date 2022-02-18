import java.util.Scanner;

public class A1E3 {
    public static void main(String args[]){
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero= scanner.nextInt();
        System.out.println("\n");
        System.out.println("El doble del nmuero es: " + numero*2);
        System.out.println("El triple del nmuero es: " + numero*3);
    }
}
