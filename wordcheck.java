import java.util.Scanner;

class wordcheck
{
    public static void main(String args[])
    {
        System.out.println("Enter The word:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int len=word.length();
        //char str[] = new char[15];
        for(int i=0;i<=len;i++)
        {
            if (word.charAt(i)=='a'|| word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='A'|| word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U')
            {
                System.out.println(word.charAt(i)+" - Vowel,");
            }
            else if(word.charAt(i)>='a' && word.charAt(i)<='z' || word.charAt(i)>='A' && word.charAt(i)<='Z')
            {
                System.out.println(word.charAt(i)+" - Consonant,");
            }
            else
            {
                System.out.println("Error: Input is not a letter");
            }

        }
    }
}

