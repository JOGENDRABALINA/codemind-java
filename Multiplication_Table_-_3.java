import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int h = s.nextInt();
        int i;
        for (i=m;i<=h;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}