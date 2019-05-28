//属性初始化练习
class A{
	A(String test){
		System.out.println(test);
	}
}
public class Practice7{
	
	A a=new A("定义时初始化");
	A a1;
	A a2;
	Practice7(){
		a1=new A("定义方法时初始化");
	}
	{
		a2=new A("构造代码块时初始化");
	}
	static A a3=new A("静态属性-定义时初始化");
	static {
		a3=new A("静态属性-静态代码块1时初始化");
	}
	public static void main(String[] args){
		Practice7 c1=new Practice7();
		//Practice7 c2=new Practice7();
	}
	static {
		a3=new A("静态属性-静态代码块2时初始化");
	}
}