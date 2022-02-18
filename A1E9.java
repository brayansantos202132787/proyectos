import java.util.Scanner ;

public class A1E9 {
    public static void main(String[] args){
        String palabra1, palabra2, reversa1="", reversa2="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la primer palabra");
        palabra1 = entrada.nextLine();
        System.out.println("Ingresa la segunda palabra");
        palabra2 = entrada.nextLine();
        for (int x = palabra1.length(); x>0; x--){
            reversa1= reversa1 + palabra1.substring(x-1,x);
        }
        for (int x = palabra2.length(); x>0; x--){
            reversa2= reversa2 + palabra2.substring(x-1,x);
        }



        System.out.println(reversa1);
        System.out.println(reversa2);

    }
}
