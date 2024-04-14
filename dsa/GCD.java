import java.util.Scanner;
public class GCD {
      public static void main(String[] args){
            Scanner h = new Scanner(System.in);
            int dividend= h.nextInt();

            Scanner hc = new Scanner(System.in);
            int divisor = hc.nextInt();

            while (dividend % divisor != 0) {
                  int rem = dividend % divisor;
                  dividend = divisor;
                  divisor= rem;
            }
            System.out.println(divisor);
      }
}