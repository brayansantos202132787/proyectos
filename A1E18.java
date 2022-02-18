import java.util.Scanner;

public class A1E18 {
    public static void main(String args[]) {;
        String numero1, numero2, numero3, numero4;
        Scanner scanner = new Scanner(System.in);
        String valor;
        boolean verificado= false;
        while(verificado!=true){
            System.out.println("Ingresa un número: ");
            valor=scanner.next();
            if(valor.length()<=4){
                verificado= true;
            } else {
                System.out.println("El valor ingresado es incorrecto");
                System.out.println("\n");
            }

            if(valor.length()==1){
                System.out.println("d1 = 0, d2 = 0, d3 = 0, d4 = " + valor.substring(0,1) + ". La suma es: " + valor.substring(0,1));
            } else if(valor.length()==2){
                int respuesta= Integer.parseInt(valor.substring(0,1))+Integer.parseInt(valor.substring(1,2));
                System.out.println("d1 = 0, d2 = 0, d3 = "+valor.substring(0,1)+", d4 = " + valor.substring(1,2) + ". La suma es: " + respuesta);
            } else if(valor.length()==3){
                int respuesta= Integer.parseInt(valor.substring(1,2))+Integer.parseInt(valor.substring(2,3))+Integer.parseInt(valor.substring(0,1));
                System.out.println("d1 = 0, d2 = "+valor.substring(0,1)+", d3 = "+valor.substring(1,2)+", d4 = " + valor.substring(2,3) + ". La suma es: " + respuesta);
            } else if(valor.length()==4){
                int respuesta= Integer.parseInt(valor.substring(3,4))+Integer.parseInt(valor.substring(1,2))+Integer.parseInt(valor.substring(2,3))+Integer.parseInt(valor.substring(0,1));
                System.out.println("d1 = "+valor.substring(0,1)+", d2 = "+valor.substring(1,2)+", d3 = "+valor.substring(2,3)+", d4 = " + valor.substring(3,4) + ". La suma es: " + respuesta);
            }

        }


    }
}
