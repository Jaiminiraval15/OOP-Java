import java.lang.String;
import java.util.Scanner;
public class Sentence{
	public static void main(String args[]){
		String line=new String();
		Scanner sc=new Scanner(System.in);
		int vowels=0,consonants=0;
		System.out.println("Enter sentence");
		line=sc.nextLine();
		line=line.toLowerCase();
		for(int i=0;i<line.length();i++){
			char ch=line.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
				vowels++;
			}
			else {
				consonants++;
			}
			

		}

			System.out.println("Vowels: "+vowels);
			System.out.println("Consonants: "+consonants);

	}
}