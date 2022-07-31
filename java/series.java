import java.io.*;
import java.util.*;
public class series{
	public static void main(String args[]){
	
		System.out.println("enter a no.");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;


		}
		System.out.println("Sum is:"+sum);
	}
}