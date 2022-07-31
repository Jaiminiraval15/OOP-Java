import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]){
		int n,rev=0,rem;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev){
			System.out.println("palindrome no.");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}