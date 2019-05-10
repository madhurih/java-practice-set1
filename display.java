import java.util.Scanner;

class display
{
    public static void main(String args[])
    {
        System.out.println("Enter The character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("a small case letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("a capital letter");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("a digit");
        }
        else
        {
            System.out.println("a special character");
        }

    }
}

