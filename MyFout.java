import java.io.*;
class MyFout
{
	
public static void main(String st[])
{
	try
	{
String data="Welcome to ainwik!";
FileOutputStream fout=new FileOutputStream("quote.txt");
fout.write(data.getBytes());
System.out.println("Data saved successfully");
fout.close();
	}
	catch( Exception e)
	{}
}
}



































