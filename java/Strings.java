import java.util.Scanner;
import java.lang.String;
public class Strings{
	public static void main(String args[]){
		String str,temp;
		Scanner sc= new Scanner(System.in);
		str=sc.next();
		temp=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}

}