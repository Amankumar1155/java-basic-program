class MainEngine
{

public void main(String args[])
{
MyTask obj=new MyTask();
MyTask1 t1=new MyTask1(obj);
MyTask1 t2=new MyTask2(obj);

t1.start();
t2.start();





}
}