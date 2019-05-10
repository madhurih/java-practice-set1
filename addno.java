import java.util.Scanner;

class addno
{
    public static void main(String args[])
    {
        int total=0;
        System.out.println("Enter The Number of inputs you want to enter:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter The Numbers:");
        for(int i=0; i<num; i++)
        {
            Scanner sc1 = new Scanner(System.in);
            int no = sc1.nextInt();
            total=total+no;
        }
        System.out.println(total);
    }
}
