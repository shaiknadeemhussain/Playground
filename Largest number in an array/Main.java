import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int idx=0;idx<=size-1;idx++)
      {
       arr[idx]=in.nextInt();
      }
      int max;
      if(arr[0]>arr[1])
      {
      max=arr[0];
      }
        else
        {
        max=arr[1];
        }
      
      for(int idx=2;idx<=size-1;idx++)
      {
        if(max<arr[idx])
        {
        max =arr[idx];
        }
      }
      System.out.println(max);
      }
    
}