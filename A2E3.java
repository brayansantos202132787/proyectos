//import java.util.Scanner ;

import java.util.Scanner;

public class A2E3 {
  public static void main(String[] args){
      int num;
      long factorial=1;
      int valor;
      Scanner scanner= new Scanner(System.in);
      System.out.println("Pedir valor");
      num = scanner.nextInt();
      for(int x=num ;x > 0; x--){
          factorial = factorial * x;
      }
      System.out.println("El factorial de " + num + " es " + factorial);
  }

}
