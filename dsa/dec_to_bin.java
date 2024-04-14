import java.util.Scanner;
public class dec_to_bin {
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            // int n=101011;
            int ans = 0;
            int mul = 1;
            while (n != 0) {
                  int rem = n % 10;
                  ans = ans + rem * mul;
                  mul *= 2;
                  n /= 10;
            }
            System.out.println(ans);
      }
}