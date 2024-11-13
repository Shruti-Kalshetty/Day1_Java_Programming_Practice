import java.util.Scanner;

public class ArithmaticOperator 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();

        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int sum=num1+num2;
        int Substraction=num1-num2;
        int multiply=num1*num2;
        int division=num1/num2;

        System.out.println(sum);
        System.out.println(Substraction);
        System.out.println(multiply);
        System.out.println(division);

        sc.close();
    }

}
