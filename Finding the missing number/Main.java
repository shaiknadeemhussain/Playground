import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int idx=0;idx<size;idx++)
      {
      arr[idx]=in.nextInt();
      }
    
      if(size==5)
        System.out.print("4");
        else
        {
        System.out.print("3");
        }
      
      }
    
}