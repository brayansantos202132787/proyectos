import java.util.Scanner ;

public class A2E2 {
    public static void main(String[] args){
        int numero;
        int valor ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pedir valor");
        valor= scanner.nextInt();
        for(int x = valor; x >= 1; x--){
            System.out.println(x);
        }
        }
}
