//write a program to get input any  value from cmd and save your data any file.
import java.util.Scanner;
import java.io.*;
class MyFout1
{

public static void main(String st[])
{
   try{
	   Scanner Obj=new Scanner(System.in);
	   System.out.println("Enter the String");
	   String name=Obj.nextLine();
	 FileOutputStream fout=new FileOutputStream("mail.txt");
//byte values[]=name.getBytes();
fout.write(name.getBytes());
System.out.println("Data Saved Successfully");
fout.close();	 
   }
   catch(Exception e)
   {}
}
}