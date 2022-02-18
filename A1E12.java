import java.util.Scanner;

public class A1E12  {
    public static void main(String[]args ) {
        double fahrenheit = 0;
        double celsius;
        System.out.println("Ingrese temperatura en celsius ");
        Scanner scanner = new Scanner(System.in);
        celsius= scanner.nextInt();
        fahrenheit= (celsius*9/5)+32;
        System.out.println("La temperatura en fahrenheit es " + fahrenheit);
    }

}
