class Mytask implements Runnable
{
@Override
public void run()
{
 for(int i=1; i<4; i++)
{
System.out.print(i);
}
}
public static void main(String args[])
{
Mytask obj=new Mytask();
Thread t1=new Thread(obj);
t1.start();
}
}
