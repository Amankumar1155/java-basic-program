import java.io*
class ByteArrayout
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("ByteArrayout.txt");
ByteArrayoutputStream bout=new ByteArrayoutputStream();
for(int i=65; i<=90; i++)
bout.write(i);
bout.writeTo(fout);
System.out.println("Data Save Successfully");
}
catch(Exception e)
{}
}
}