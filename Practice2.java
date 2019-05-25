public class Practice2{
	public static void learndifferent(){
		//int 100;          //不能用数字开头  
		//int *aaa;        //不能用*开头
		//int $21324;     //编译没问题，但不建议用  
		//int 我能行；   //编译没问题，但没这么用过
		//int for;      //关键字不能用     
	}
	public static void learnUnicode(){
		String a="中国";
		String b="\u4e2d\u56fd";
		System.out.println(a);
		System.out.println(b);
	}
	public static void learnLiteral(){
		//byte a=127;
		//int b=111;
		int c=(int)100L;
		int d=0xFF;
		int e=0b11;
	}
	public static void Typecasat(){
		//1. 范围⼩的数据类型可以⾃动变为数据范围⼤的数据类型（在数学计算时）
        //2. 数据范围⼤的数据类型只有强制转换才能转为数据类型⼩的数据类型
		long a=100L;
		int b=100;
		int c=(int)a;   //long ->int 要用强制类型转换
		int d=b;       //int->long不需要强制类型转换
		System.out.println(c);
		System.out.println(d);
	}
	public static void learnRange(){
		System.out.println("byte型的范围");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}
	public static void learnStringAdd(){
		//使用+实现字符串的连接，用括号可以代表先实现哪一部分
		int a=3;
		int b=4;
		System.out.println("结果是"+a+b);
		System.out.println("结果是"+(a+b));
	}
	public static void main(String[ ] args){
		learnUnicode();
		learnLiteral();
		Typecasat();
		learnRange();
		learnStringAdd();
	
	}
}