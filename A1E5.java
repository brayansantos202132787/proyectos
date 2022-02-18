import java.util.Scanner;

public class A1E5 {
    public static void main(String args[]){
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero= scanner.nextInt();
        int respuesta= numero+1;
        System.out.println("\n");
        System.out.println("el siguiente numero es: " + respuesta);
    }
}