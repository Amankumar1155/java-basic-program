class MyTask2 extends Thread
{
MyTask obj;
MyTask2(MyTask obj)
{
this.obj=obj;
}
@Override
public void run()
{
obj.mytask();
}
}
