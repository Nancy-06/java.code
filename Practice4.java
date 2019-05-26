//如何定义一个类
class Person{
	String name;
	int age;
	//不给出构造方法，会有一个默认的构造方法
	Person(){}
	Person (String n,int a){
		System.out.println(n);
		System.out.println(a);
		name=n;
		age=a;
	}
	void print(){
		System.out.printf("name=%s,age=%d%n",name,age);
	}	
}
public class Practice4{
	public static void main(String [] args){
		Person personNull=null;
		//如何根据类创建对象
		Person person1=new Person();
		//适用对象
		//对象.属性
		//对象.方法
		person1.name="中国人";
		person1.age=5000;
		person1.print();
		Person person2=new Person();
		person2.print();
		Person person3=new Person("第四个",18);
		
	}
	}