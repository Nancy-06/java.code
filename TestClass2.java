//成员变量的默认初始值
public class TestClass2{
	private byte b;
	private short s;
	private int i;
	private long l;
	private float f;
	private double d;
	private boolean b1;
	private char c;
	public  static void main(String [] args){
		TestClass2 init=new TestClass2();
		System.out.println("byte类型的初始值:"+init.b);
		System.out.println("短整型类型的初始值:"+init.s);
		System.out.println("整型类型的初始值:"+init.i);
		System.out.println("长整型类型的初始值:"+init.l);
		System.out.println("单精度浮点类型的初始值:"+init.f);
		System.out.println("双精度类型的初始值:"+init.d);
		System.out.println("布尔类型的初始值:"+init.b1);
		System.out.println("字符类型的初始值:"+init.c);
	}
}