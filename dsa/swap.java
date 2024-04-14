public class swap {
      //by this method the no's will not be swapped
      // public static void main(String[]args){
      //       int [] arr = {3,4,5,6,7,8,9};
      //       System.out.println(arr[0]+ " "+arr[1]);
      //       swap (arr[0],arr[1]);
      //       System.out.println(arr[0]+ " "+arr[1]);
      // }
      // public static void swap (int a,int b){
      //       int temp=a;
      //       a=b;
      //       b=temp;
      // }


      //this sunction will swap the no's ->
      public static void main(String[] args) {
            int[]arr ={1,2,3,4,5};
            System.out.println(arr[0]+" "+arr[1]);
            swap(arr,0,1);
            System.out.println(arr[0]+" "+arr[1]);
      }
      public static void swap(int[]arr,int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
      }
}
