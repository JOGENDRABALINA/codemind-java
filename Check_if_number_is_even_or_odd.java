import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        if (a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}