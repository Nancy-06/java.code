//多态性
class Person{
	public void print(){
		System.out.println("1.我是父类");
	}
}
class Student extends Person{
	public void print(){
		System.out.println("2.我是子类");
	}
	public void printf(){
		System.out.println("3.只有子类有");
	}
}
public class Practice26{
	public static void main(String [] args){
		//向上转型：父类 父类对象=子类实例
		Person person=new Student();
		person.print();
		//向下转型：子类  子类对象=（子类）父类实例
		Student student=(Student)person;
		student.printf();
	}
}