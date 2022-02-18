import java.util.Scanner;

public class A1E4 {
    public static void main(String args[]) {
        int base;
        int exponente;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una base: ");
        base = scanner.nextInt();
        System.out.println("\n");
        System.out.println("Ingrese un exponente: ");
        exponente= scanner.nextInt();
        int respuesta= 1;
        for(int x = 0; x < exponente ; x++){
          respuesta=respuesta*base;
        }
        System.out.println("\n");
        System.out.println(respuesta);
    }
}