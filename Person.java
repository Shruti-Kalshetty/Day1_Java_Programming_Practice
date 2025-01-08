import java.util.Scanner;
 
public class Person {
 
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
 
		System.out.println("Enter name:");

		String name=sc.next();

		System.out.println("Enter age:");

		int age=sc.nextInt();

		System.out.println("Enter height");

		double height=sc.nextDouble();

		System.out.println("Name:"+name+"\nAge:"+age+"\nHeight:"+height);

	}
 
}

 