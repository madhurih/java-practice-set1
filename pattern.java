import java.util.Scanner;

class pattern
{
    public static void main(String args[])
    {
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        int i, j;
        for(i=1; i<=temp; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
        }

    }
}