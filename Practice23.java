//简单的覆写练习
class Person{
	public void print(){
		System.out.println("1.Person的print方法");
	}
}
class Student extends Person{
	public void print(){
		System.out.println("2.Student的print方法");
	}
}
public class Practice23{
	public static void main(String [] args){
		new Student().print();
	}
}