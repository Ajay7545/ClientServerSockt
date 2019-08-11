import java.net.*;
import java.io.*;
import java.util.*;

public class Cli2{

public static void main(String []args) throws IOException,UnknownHostException
{
	int num;
	String str1;
	Scanner s12=new Scanner(System.in);
	Socket s=new Socket("localhost",5050);
	Scanner sc=new Scanner(s.getInputStream());
	num=s12.nextInt();
	str1=s12.nextLine();
	
	PrintStream p1=new PrintStream(s.getOutputStream());
	p1.println(num);
	//p.println(str1);
	int pk=sc.nextInt();
	System.out.println("the pk iss:"+pk);
}

}
