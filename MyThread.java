class MyThread extends Thread
{
	
@Override
public void run()
{
for(int i=0; i<=999; i++)
{
try
{
Thread.sleep(30);
}
catch(Exception e)
{}
System.out.print(i);
}
}
public static void main(String args[])
{
MyThread t1=new MyThread();
t1.start();
}
}