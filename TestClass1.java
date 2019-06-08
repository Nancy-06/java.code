//利用类表示学生信息
class Student{
	private String name;
	private String sex;
	private int age;
	public Student(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
}
public class TestClass1{
	public static void main(String[] args){
		Student student=new Student("张三","男",18);
		System.out.println("姓名："+student.getName());
		System.out.println("性别："+student.getSex());
		System.out.println("年龄："+student.getAge()+"岁");
	}
}