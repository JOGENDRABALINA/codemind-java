import java.util.Scanner;
public class Add{
         public static void main(String[] args)
         {
              Scanner s=new Scanner(System.in);
              int a=s.nextInt();
              int b=s.nextInt();
              float c=(a+b)*0.5f;
              System.out.printf("%.4f",c);
         }
}