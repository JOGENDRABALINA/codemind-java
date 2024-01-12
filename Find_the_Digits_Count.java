import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int c=0;
        for(i=1;i<=n;i++)
        {
            int r=n%10;
            n=n/10;
            c=c+1;
        }
        System.out.println(c+1);
    }
}