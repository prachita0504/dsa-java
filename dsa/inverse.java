import java.util.Scanner;
public class inverse {
    public static void main(String args[]) {
        // Your Code Here
        // int n = 123456789;
        Scanner h = new Scanner (System.in);
        int n = h.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        // sum = sum + rem ;
        System.out.println(sum);

    }
}
