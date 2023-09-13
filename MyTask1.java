class MyTask1
{

public void mytask()
{
for(int i=1; i<=3; i++)
{
try
{
Thread.sleep(2000);
}
catch(Exception e)
{}
System.out.println(i);
}
}
}