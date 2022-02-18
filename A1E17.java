import java.util.Scanner;

public class A1E17 {
    public static void main(String args[]) {
        int lado1;
        int lado2;
        int lado3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado1 ");
        lado1 = scanner.nextInt();
        System.out.println("Ingrese el lado2: ");
        lado2 = scanner.nextInt();
        System.out.println("Ingrese el lado3: ");
        lado3 = scanner.nextInt();
        if(lado1==lado2&&lado1==lado3&&lado2==lado3) {
            System.out.println("Triangulo Equilatero");
        } else if((lado1==lado2)||(lado2==lado3)){
            System.out.println("Triangulo Isoceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }

        }
    }
