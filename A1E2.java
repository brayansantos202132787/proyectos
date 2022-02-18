import java.util.Scanner;

public class A1E2 {

    public static void main(String args[]){
        String capital;
        String pais;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el pais: ");
        pais= scanner.nextLine();
        System.out.println("\n");
        System.out.println("Ingrese la capital del pais: ");
        capital= scanner.nextLine();
        System.out.println("\n");
        System.out.println(capital + " es la capital de " + pais);
    }
}
