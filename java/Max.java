import java.io.*;
import java.util.*;
public class Max{
	public static void main(String[] args){
		System.out.println("Enter two nos.");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b){
			System.out.println("a is largest");
		}
		else{
			System.out.println("b is largest");
		}
	}
}