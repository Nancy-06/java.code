class Person{
	public void print(){
		System.out.println("1.我是人类。");
	}
}
class Student extends Person{
	public void print(){
		System.out.println("2.我是学生。");
	}
}
class Worker extends Person{
	public void print(){
		System.out.println("3.我是工人。");
	}
}
public class Practice27{
	public static void whoYouAre(Person per){
		per.print();
	}
	public static void main(String [] args){
		whoYouAre(new Student());
		whoYouAre(new Worker());
	}
}