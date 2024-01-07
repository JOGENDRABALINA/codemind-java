import java.util.Scanner;
public class Add{
         public static void main(String[] args)
         {
              Scanner s=new Scanner(System.in);
              int a=s.nextInt();
              int b=a*4;
              if (b<=1000)
              {
                  System.out.println("YES");
              }
              
              else
              {
                  System.out.println("NO");
              }
              
         }
}