import java.util.Scanner;

public class repeat
{
    public static void main(String [] args)
    {
        System.out.println("enter a string ");
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int length=s.length();
        System.out.println("enter a number less than "+length);
        int n=obj.nextInt();
        int m=length-n;
        for (int i=0;i<m;i++)
        {
            System.out.print( s.charAt(i));
        }
        for (int k=0;k<n;k++)
            for (int j=m;j<length;j++)
            {
                System.out.print( s.charAt(j));
            }


    }
}
