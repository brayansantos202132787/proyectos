import java.util.Scanner ;

public class A1E8 {
    public static void main(String args[]){
        int notas=0;
        double promedio;
        int valor;
        Scanner scanner = new Scanner(System.in);
        for(int x=0; x<3;x++){
            System.out.println("Ingrese una nota:");
            valor= scanner.nextInt();
            notas=notas+valor;
        }
        promedio= notas/3;
        System.out.println("\n");
        System.out.println("El promedio de las notas del semestre son de: "+promedio);
    }
}
