import java.util.Scanner;

public class array {
      public static void main(String[] args) {
            // int[] arr = new int[5];
            // System.out.println(arr);
            // System.out.println(arr.length);

            // //set
            // arr[0]=67;
            // arr[1]=678;
            // arr[2]=90;
            // arr[3]=89;
            // arr[4]=76;

            // //print
            // System.out.println(arr[0]);


            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int [] arr = new int[n];
            for (int i =0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
            }
            System.out.println(" ");
            Display (arr);
      }

      public static void Display (int[]arr){
            for(int i=0;i<arr.length;i++){
                  System.out.println(arr[i]+" ");
            }
            System.out.println();
      }
}
