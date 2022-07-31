import java.io.*;
import java.util.*;
public class Operator{
	public static void main(String[] args){
		System.out.println("Enter three nos.");
		int a,b,c,ans;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		ans=a*b*c+(a+b)/b-c;
		System.out.println("Answer is "+ans);

	}
}