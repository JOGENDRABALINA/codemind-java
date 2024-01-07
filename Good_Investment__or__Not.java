import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c=b*2;
        if (c<=a)
        {
            System.out.println("YES");
        }
        
        else
        {
            System.out.println("NO");
        }
    }
}