class Base{
	{
		System.out.println("Base的构造代码块1");
	}
	static {
		System.out.println("Base的静态代码块1");
	}
	Base(){
		System.out.println("Base的构造方法");
	}
	{
		System.out.println("Base的构造代码块2");
	}
	static {
		System.out.println("Base的静态代码块2");
	}
}
class Remove extends Base{
	{
	    System.out.println("Remove的构造代码块1");
	}
	static {
		System.out.println("Remove的静态代码块1");
	}
	Remove(int n){
		super();
		System.out.println("Remove的有参构造方法");
	}
	Remove(){
		this(10);
		System.out.println("Remove的无参构造方法");
	}
	{
		System.out.println("Remove的构造代码块2");
	}
	static {
		System.out.println("Remove的静态代码块2");
	}
}
public class Test0623{
	public static void main(String [] args){
		System.out.println("开始");
		new Remove();
		new Remove();
		System.out.println("结束");
	}
}





















