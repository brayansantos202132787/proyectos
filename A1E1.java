import java.util.Scanner;

public class A1E1 {

    public static void main(String args[]){
        int numero1;
        int numero2;
        int respuesta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        numero1 = scanner.nextInt();
        System.out.println("\n");
        System.out.println("Ingrese el segundo número:");
        numero2= scanner.nextInt();
        System.out.println("\n");
        respuesta= numero1+numero2;
        System.out.println("El resultado es: "+respuesta);
    }
}
