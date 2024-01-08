import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a = s.nextLine();
        
        if (a.charAt(0)=='G')
        {
            System.out.println("Green");
        }
        else if (a.charAt(0)=='V')
        {
            System.out.println("Violet");
        }
        
        else if (a.charAt(0)=='B')
        {
            System.out.println("Blue");
        }
        else if (a.charAt(0)=='Y')
        {
            System.out.println("Yellow");
        }
        else if (a.charAt(0)=='O')
        {
            System.out.println("Orange");
        }
        else if (a.charAt(0)=='R')
        {
            System.out.println("Red");
        }
        else 
        {
            System.out.println("-1");
        }
        
        
    }
}