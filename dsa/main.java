import java.util.Scanner;

// public class main {
//       public static void main(String[] args) {

//             Scanner s = new Scanner(System.in);
//             int n = s.nextInt();

//             int row = 1;
//             int nst = n-1/2;
//             int nsp = 0;

//             while (row <= 2*n-1) {
//                   // left star
//                   int i = 1;
//                   while (i <= nst) {
//                         System.out.print("*");
//                         i = i + 1;
//                   }
//                   // space
//                   int j = 1;
//                   while (j <= nsp) {
//                         System.out.print(" ");
//                         j = j + 1;
//                   }
//                   // right star
//                   int k = 1;
//                   if(row==n) {
//                         k=2;
//                   }
//                   while (k <= nst) {
//                         System.out.print("*");
//                         k = k + 1;
//                   }
//                   //preparation for next row
//                   if(row<n){
//                         nst = nst - 1;
//                         nsp = nsp + 2;
//                   }else{
//                         nsp=nsp-2;
//                         nst=nst+1;
//                   }
//                   System.out.println();
//                   row++;
//             }
//       }
// }

public class main {
      public static void main(String args[]) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int row = 1;
            int nst = n;
            int nsp = -1;

            while (row <= 2 * n - 1) {

                  // print the left Star
                  int i = 1;
                  while (i <= nst) {
                        System.out.print("*");
                        i++;
                  }
                  // Print the Space

                  int j = 1;
                  while (j <= nsp) {
                        System.out.print(" ");
                        j = j + 1;
                  }

                  // Print the right Star
                  int k = 1;

                  if (row == 1 || row == 2 * n - 1) {
                        k = 2;
                  }
                  while (k <= nst) {
                        System.out.print("*");
                        k = k + 1;
                  }

                  // preparation for next row
                  if (row < n) {
                        nst--;
                        nsp += 2;
                  } else {
                        nst++;
                        nsp -= 2;
                  }

                  System.out.println();
                  row = row + 1;
            }
      }
}