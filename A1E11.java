import java.util.Scanner;

public class A1E11 {

    public static void main(String[] args){
        double yardas;
        double metros;
        double pies;
        double pulgadas;
        double valor;
        System.out.println("Ingrese los centimetros a convertir: ");
        Scanner scanner = new Scanner(System.in);
        valor= scanner.nextInt();
        metros=(valor*1)/100;
        yardas=(metros*1.09)/1;
        pies=(yardas*3)/1;
        pulgadas=(yardas*36)/1;
        System.out.println("La cantidad en pulgadas es: " + pulgadas);
        System.out.println("la cantidad en pies es: " + pies );
        System.out.println("La cantidad en yardas es: " + yardas);
        System.out.println("La cantidad de metros es: " + metros);



    }


}
