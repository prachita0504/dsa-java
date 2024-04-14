import java.util.Scanner;

public class pattern {
      public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int row = 1;
            int nsp = (2 * n) - 3;
            int nst = 1;
            int row_val = 1;

            while (row <= n) {
                  int i = 1;
                  int col_val = row_val;
                  while (i <= nst) {
                        System.out.print(col_val);
                        col_val++;
                        i++;
                  }

                  int j = 1;
                  while (j <= nsp) {
                        System.out.print(" ");
                        j++;
                  }

                  int k = 1;
                  int col_valu = row_val;
                  if (row == n) {
                        k = 2;
                  }
                  while (k <= nst) {
                        System.out.print(col_valu);
                        col_valu = -col_valu + 1;
                        k++;
                  }

                  nst = nst + 1;
                  nsp = nsp - 2;
                  System.out.println();
                  row++;
            }
      }
}
