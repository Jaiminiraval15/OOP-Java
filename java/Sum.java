import java.io.*;
import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		System.out.println("Enter two nos.");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition is "+c);
	}
}