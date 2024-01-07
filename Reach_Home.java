import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c=a*5;
        if (c>=b)
        {
            System.out.println("YES");
        }
        
        else
        {
            System.out.println("NO");
        }
    }
}