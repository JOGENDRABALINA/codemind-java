import java.util.*;
public class Home{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        float c=(((b-a)*100f)/a);
        System.out.printf("%.2f",c);
    }
}