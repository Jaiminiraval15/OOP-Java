import java.io.*;
import java.util.*;
public class calc{
	public static void main(String args[]){
	
		System.out.println("Enter nos.");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int c=s.nextInt();
		
		switch(c){
		case 1:
			System.out.println(" Addition is "+ (a+b));
			break;
		case 2:
		System.out.println(" Subtraction is "+ (a-b));
			break;
		case 3:
			System.out.println("Multiplication is "+ (a*b));
			break;
		case 4:
		System.out.println("Division is "+ (a/b));
			break;
		}
		}
	}

		




		
		

