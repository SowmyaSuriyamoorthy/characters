import java.util.Scanner;

public class Alphabet
{
private static String d;

public static void main(String[] args) 
{
	char c = 0;
	System.out.println("enter the characters:");
	Scanner s=new Scanner(System.in);
	d = s.next();
	if((c>='a' &&  c<='z') || (c>='A' && c <='z' ))
	{
		System.out.println("characters");
	}
	else
	{
		System.out.println("not a characters");
	}
}
}
