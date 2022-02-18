import java.util.Random;

public class A1E7 {
    public static void main(String args[]){
        int Min = 10 ;
        int Max = 50;
        Random random = new Random();
        int value = random.nextInt(Max - Min ) + Min;
        System.out.println(value);
        double disminuido = value - (value*0.15);
        System.out.println(disminuido);
    }
}