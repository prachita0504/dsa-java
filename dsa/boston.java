import java.util.Scanner;
public class boston {
      public static void main(String[]args){
            Scanner h = new Scanner (System.in);
            int n = h.nextInt();
            System.out.println(is_boston_num(n));
      }

      public static int is_boston_num(int n){
            int digit = sumofdigit(n);
            int pf =0;
            int div =2;
            while (div<=n) {
                  int rem = n%div;
                  if(rem==0){
                        pf=pf+sumofdigit(div);
                        n=n/div;
                  }else{
                        div++;
                  }
            }
            if(pf==digit){
                  return 1;
            }else {
                  return 0;
            }
      }

      public static int sumofdigit(int num){
            int sum = 0;
            while (num!=0) {
                  int rem = num % 10 ;
                  sum+=rem;
                  num=num/10;
            }
            return sum;
      }
}
