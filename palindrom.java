import java.util.Scanner;
class Palindrom
{
    public static void main(String args[])
    {
            System.out.println("Enter The Numbet:");
            Scanner no=new Scanner(System.in);
            int temp=no.nextInt();
            int rem, x, rev=0, result=0;
            int old=temp;

            while(temp!=0)
            {
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(old==rev)
            {
                int p=rev;
                {
                    x=p%10;
                    if(x%2==0)
                    {
                        result=result+x;
                    }
                    p=p/10;
                }
                if(result>25)
                {
                    System.out.println(old + "is palindrome numbar and addition of even digit of the number is greater than 25");
                }
                else if(result<25)
                {
                    System.out.println(old + "is palindrome number and addition of even digit of the number is less than 25");
                }
                else
                {
                    System.out.println(old + "is palindrome number and addition of even digit of the number is equal to 25");
                }
            }
            else
            {
                System.out.println(old + "is not palindrome number");
            }
    }
}