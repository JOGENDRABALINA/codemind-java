import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        if (n<3)
        {
            
            System.out.println("LIGHT");
        }
        
        else if (n>=3 && n<7)
        {
            System.out.println("MODERATE");
        }
        else
        {
            System.out.println("HEAVY");
        }
    }
}