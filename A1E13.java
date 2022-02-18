import java.util.Scanner;

public class A1E13 {
    public static void main(String args[] ){
        String radio;
        String altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio ");
        radio= scanner.nextLine();
        System.out.println("Ingrese altura ");
        altura= scanner.nextLine();
        if (Double.parseDouble(radio)>=0&&Double.parseDouble(altura)>=0){
            double volumen = (3.14* Double.parseDouble(radio) * Double.parseDouble(radio )* Double.parseDouble(altura ));
            System.out.println("El voluemen del cilindro  es: "+ volumen);
        } else {
            System.out.println("Existe un valor negativo, por lo cual no se puede calcular el volumen");
        }


    }
}

