import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int option=in.nextInt();
      switch(option)
      {
        case 1:
          int side=in.nextInt();
          int area_sqr=side*side;
          System.out.println(area_sqr);
        break;
        case 2:
          int len=in.nextInt();
          int bre=in.nextInt();
          int area_rec=len*bre;
          System.out.print(area_rec);
          break;
        case 3:
          int base=in.nextInt();
          int height=in.nextInt();
          int area_tri=(base*height)/2;
          System.out.print(area_tri);
          break;
        case 4:
          int radius=in.nextInt();
          double area_cirle=3.14*radius*radius;
          System.out.print(area_cirle);
          break;
     }
    }
}