import java.lang.String;
import java.util.Scanner;
public class Array{
	public static void main(String[] args){
		int[] num=new int[3];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		num[0]=sc.nextInt();
		num[1]=sc.nextInt();
		num[2]=sc.nextInt();
		num[3]=sc.nextInt();
		for(int i=0;i<=num.length-1;i++){
			sum=sum+num[i];
		}
		System.out.println("Average is "+(sum/num.length-1));
	}
}