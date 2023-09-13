class Test
{
@Override
public void finalize()
{
System.out.println("Kaam ho gaiya!");
}
public static void main(String st[])
{
//1 condition1--new Test();
/*condition2--
Test t=new Test();
t=null;
*/
 Test t1=new Test();
 Test t2=new Test();
 t1=t2;
 System.gc();
}
}