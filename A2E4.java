import java.util.Scanner ;

public class A2E4 {
    public static void main(String[]args){
        int x = 0;
        int mayoredad = 0;
        int menoredad = 0;
        int temporalmenor = 0;
        int temporalmayor = 0;
        Scanner scanner = new Scanner(System.in);
        while(x < 20 ){
           System.out.println("Ingrese una edad");
           mayoredad= scanner.nextInt();

           if(x>0){
               if(mayoredad > temporalmayor){
                   if(temporalmenor==0){
                       temporalmenor=temporalmayor;
                   }
                   temporalmayor=mayoredad;
               }else if(temporalmenor>mayoredad){
                   temporalmenor=mayoredad;
               }
           }else{
               temporalmayor=mayoredad;
           }

            x++;

        }
        System.out.println("La persona con mayor edad tiene : " +temporalmayor);
        System.out.println("La persona con menor edad tiene : " +temporalmenor);
    }
    }

