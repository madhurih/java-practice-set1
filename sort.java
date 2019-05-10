import java.util.Scanner;

class sort
{
    public static void main(String args[])
    {
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sorted = 0;
        int digits = 10;
        int sortedDigits = 1;
        boolean first = true;

        while (num > 0)
        {
            int digit = num % 10;

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit <= tmpDigit) {
                        sorted = sorted / toDivide * toDivide * 10 + digit * toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits - 1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }

            first = false;
            num = num / 10;
        }
        System.out.println("Sorted no in non-increasing order:"+sorted);

        int x,result=0;
        int p=sorted;
        while(p>0)
        {
            x=p%10;
            if(x%2==0)
            {
                result=result+x;
            }
            p=p/10;
        }
        System.out.println("Sum of even numbers:"+result);

        if(result>=15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
