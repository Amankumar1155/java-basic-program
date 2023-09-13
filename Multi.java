class Multi extends Thread{
@Override  
public void run()
{  
System.out.println("thread is running...");  
}  
public static void main(String args[])
{  
Multi obj=new Multi();  
obj.start();  
 }  
}  