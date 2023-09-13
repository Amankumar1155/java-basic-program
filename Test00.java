import java.io.*;
class Test00
{

public static void main(String st[])
{
   try
   {
	FileInputStream file=new FileInputStream("gkp.txt");
	int x=0;
	String data="";
	while((x = file.read())!=-1)
	{
	data = data + Character.toString(x);
   }
   
   }
   
   catch(Exception e)
   {
   System.out.println(e);
   }
}
}