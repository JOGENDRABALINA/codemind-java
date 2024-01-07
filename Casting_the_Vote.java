import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        if (a>=18)
        {
            System.out.println("YES");
        }
        
        else
        {
            System.out.println("NO");
        }
    }
}