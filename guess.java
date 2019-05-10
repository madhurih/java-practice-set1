import java.util.Scanner;

public class guess
{
    public static void main(String args[])
    {
        int target=42;
        System.out.println("Guess the Target Number");
        System.out.println("Hint: The number is in range 1-50");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<50; i++)
        {
            int num = sc.nextInt();
            if (num == target)
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
            else if (num > target)
            {
                System.out.println("Number guessed is more than original number");
                System.out.println("Please try again");
            }
            else
                {
                System.out.println("Number guessed is less than original number");
                System.out.println("Please try again");
            }
        }

    }
}