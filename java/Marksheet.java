import java.io.*;
import java.util.Scanner;
public class Marksheet{
	public static void main(String[] args){
		System.out.println("Enter marks of Maths: ");
		int math,phy,chem,eng,bio,percentage;
		Scanner sc=new Scanner(System.in);
		math=sc.nextInt();
		System.out.println("Enter marks of Physics: ");
		phy=sc.nextInt();
		System.out.println("Enter marks of Chemistry: ");
		chem=sc.nextInt();
		System.out.println("Enter marks of English: ");
		eng=sc.nextInt();
		System.out.println("Enter marks of Biology: ");
		bio=sc.nextInt();
		percentage=(math+phy+chem+eng+bio)/5;
		System.out.println("Result is "+percentage);
		if(percentage>=60){
			System.out.println("First class");
		}
			else if(percentage>=50 && percentage<60){
				System.out.println("Second class");
			}
		else if(percentage>=40 && percentage<50){
			System.out.println("Third class");
		}
		else if(percentage<40){
			System.out.println("Fail");
		}


	}
}
