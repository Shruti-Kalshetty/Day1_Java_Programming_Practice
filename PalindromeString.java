import java.util.Scanner;

public class PalindromeString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word : ");
        String word=sc.nextLine();

        String org_word=word;
        String rev=" ";

        int leng=word.length();

        for(int i=leng-1; i>=0; i--)
        {
            rev=rev+word.charAt(i);
        }
        System.out.println(rev);
    }
}
