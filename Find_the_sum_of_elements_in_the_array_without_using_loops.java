import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int sum=0;
        int i;
        for(i=1;i<=a;i++)
        {
            int n = s.nextInt();
            sum=sum+n;
           
        }
         System.out.println(sum);
    }
        
}