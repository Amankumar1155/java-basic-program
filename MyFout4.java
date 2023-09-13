import java.util.Scanner;
import java.io.*;
class MyFout4
{

public static void main(String st[])
{
   try{
	   Scanner Obj=new Scanner(System.in);
	   System.out.println("Enter the String");
	   String name=Obj.nextLine();
	 FileOutputStream fout=new FileOutputStream("gkp.txt",true);
//byte values[]=name.getBytes();
fout.write(name.getBytes());
System.out.println("Data Saved Successfully");
fout.close();	 
   }
   catch(Exception e)
   {}
}
}