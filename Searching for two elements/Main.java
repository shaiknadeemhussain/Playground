import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<=arr_size-1;idx++)
      {
      arr[idx]=in.nextInt();
      }
      int element_1=in.nextInt();
      int element_2=in.nextInt();
      int elem_1=-1;
      int elem_2=-1;
      for(int idx=0;idx<=arr_size-1;idx++)
      {
      if(element_1 ==arr[idx])
      {
      elem_1=idx;
      }
        if(element_2==arr[idx])
        {
        elem_2=idx;
        }
      }
     System.out.println(elem_1);
      System.out.println(elem_2);
    }
}