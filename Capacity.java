import java.util.Scanner;
public class Add{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=2*a*b*c*512;
        int e=d/1024;
        System.out.println(e+" KB");
    }
}