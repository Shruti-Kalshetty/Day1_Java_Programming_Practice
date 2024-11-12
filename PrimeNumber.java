import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = 0;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                temp=temp+1;
                break; 
            }
        }

    
        if (temp == 0 && num > 1) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }
        sc.close(); 
    }
}
