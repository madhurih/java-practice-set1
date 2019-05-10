import java.util.Scanner;

class tomjerry
{
    public static void main(String args[])
    {
        System.out.println("Enter The Number:");
        Scanner no = new Scanner(System.in);
        int temp=no.nextInt();

        if(temp%2!=0 && (temp>=20 && temp<=30))
        {
            System.out.println("Tom");
        }
        else if(temp%2==0 && (temp>=20 && temp<=30))
        {
            System.out.println("Jerry");
        }
        else
        {
            System.out.println("no does not exist between 20 and 30");
        }
    }
}