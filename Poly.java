class Base{
	void method(){
		System.out.println("Base的method方法");
	}
	static void staticMethod(){
		System.out.println("Base的staticMethod方法");
	}
}
class Date extends Base{
	void method(){
		System.out.println("Date的method方法");
	}
	static void staticMethod(){
		System.out.println("Date的statiMethod方法");
	}
}
public class Poly{
	public static void main(String [] args){
		Date date=new Date();
		Base base=date;
		//普通方法看后面的对象类型来执行那个方法
		date.method();   //Date.method();
		base.method();   //Date.method();
		//静态方法看前面的对象类型来执行哪个方法
		//一般不建议这么用
		date.staticMethod();      //Date.staticMethod();
		base.staticMethod();      //Base.staticMethod();
	}
}