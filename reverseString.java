import java.util.Scanner;

public class reverseString
{
    public static void main(String [] args)
    {
        System.out.println("enter a string to reverse");
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int length=s.length();
        String reverse="";
        for (int i=length-1;i>=0;i--)
        {
            reverse+=s.charAt(i);
        }
        System.out.println("reversed string is -"+reverse);
    }
}