import java.io.*;
import java.net.*;
import java.util.*;


public class Ser{

public static void main(String [] args) throws IOException
{
	int n,t;
	ServerSocket s1=new ServerSocket(8080);
	Socket ss=s1.accept();
	
	Scanner sc=new Scanner(ss.getInputStream());
	n=sc.nextInt();
	System.out.println("Client send:"+n);
	t=n*2;
	PrintStream p1=new PrintStream(ss.getOutputStream());
	p1.println(t);
	
	
	ServerSocket s2=new ServerSocket(5050);
	Socket ss2=s2.accept();
	Scanner sc2=new Scanner(ss2.getInputStream());
	int t2=sc2.nextInt();
	System.out.println("Client2 val:"+t2);
	int tot=t2+5;
	PrintStream p2=new PrintStream(ss2.getOutputStream());
	p2.println(tot);

	
	
}

}