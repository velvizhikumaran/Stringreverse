# Stringreverse
import java.util.Scanner;
import java.lang.String;

public class Reversestring {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		StringBuffer s=new StringBuffer(str);
	StringBuffer x=s.reverse();
	System.out.println("the reverse of string is:"+x);
	}
}
