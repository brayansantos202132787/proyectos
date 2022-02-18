import java.util.Scanner ;

public class A2E1 {
    public static void main(String[] args){
        int numero;
        int random;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de veces a repetir el ciclo númerico:");
        numero = scanner.nextInt();
        for (int x=0; x<numero;x++){
            int aleatorio=(int)(Math.random()*100);
            if(aleatorio%2==0){
                System.out.println("El numero " + aleatorio + " es par");
            } else {
                System.out.println("El numero " + aleatorio + " es impar");
            }
        }

    }
}
