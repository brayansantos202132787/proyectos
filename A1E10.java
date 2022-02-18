import java.util.Scanner ;

public class A1E10 {
    public static void main(String args[]) {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese altura ");
        a = scanner.nextDouble();
        System.out.println("\n");
        System.out.println("Ingrese base ");
        b = scanner.nextDouble();
        System.out.println("\n");
        double area = b*a;
        System.out.println("El area es: "+ area);
        double perimetro = (2*a)+(2*b);
        System.out.println("El perimetro es " + perimetro);

    }
}
