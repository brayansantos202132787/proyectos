import java.util.Random;
import java.util.Scanner;

public class A1E20 {
    public static void main(String[]args ){
        String valor="";
        String reversa="";
        Scanner scanner = new Scanner(System.in);
        boolean verificado= false;
        while(verificado!=true){
            System.out.println("Ingresa un número: ");
            valor=scanner.next();

            if(valor.length()==5){
                for (int x = valor.length(); x>0; x--){
                    reversa= reversa + valor.substring(x-1,x);
                }
                if (valor.equals(reversa)){
                    System.out.println("Si es capicua");
                } else {
                    System.out.println("No es una capicua");
                }
                verificado=true;
            } else {
                System.out.println("El valor ingresado es incorrecto");
                System.out.println("\n");

            }

        }


    }

}
