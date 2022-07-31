import java.lang.String;
import java.io.*;
public class Commandline{
	public static void main(String args[]){
		double a= Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		System.out.println("addition is "+(a+b));

	}
}