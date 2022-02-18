import java.util.Scanner;

public class A1E19 {
    public static void main(String[]args ){
        try(Scanner reader = new Scanner(System.in)) {
            int num = 0;

            num= (int) Math.floor(Math.random()*(1+30));
            System.out.println(num);

            if (num<25){
                System.out.println("Correcto");
                if (num <= 0){
            }else {
                    System.out.println("Incorrecto");
                }
                }
        }

    }
}
