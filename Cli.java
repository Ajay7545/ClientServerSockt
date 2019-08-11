import java.util.*;
import java.net.*;
import java.io.*;

public class Cli {
	
	
	
	public static void main(String [] args) throws UnknownHostException,IOException
	{
		int num,temp;
		Scanner sc=new Scanner(System.in);
		
		Socket s=new Socket("localhost",8080);
		Scanner sc1=new Scanner(s.getInputStream());
		num=sc.nextInt();
		
		PrintStream p=new PrintStream(s.getOutputStream());
		p.println(num);
		
		temp=sc1.nextInt();
		System.out.println("the value is:"+temp);
		
	}

}