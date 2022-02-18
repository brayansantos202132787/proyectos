import java.util.Random;
import java.util.Scanner;

public class A1E6 {
    public static void main(String args[]) {
        int Min = 0 ;
        int Max = 200;
        Random random = new Random();
        int value = random.nextInt(Max + Min ) + Min;
        System.out.println(value);
        double aumentado= value + (value*0.3);
        System.out.println(aumentado);
    }
}
