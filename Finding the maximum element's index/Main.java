import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    int max;
    for(int idx=0;idx<size;idx++)
    {
    arr[idx]=in.nextInt();
    }
    if(arr[0]>arr[1])
    {
    max=0;
    }
    else
    {
    max=1;
    }
 for(int idx=2;idx<size;idx++)
 {
 if(arr[max]<arr[idx])
 {
 max=idx;
 }
 }
  System.out.print(max);
  }
  
}