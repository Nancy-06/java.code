class Person{
	private int age;
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
class Student extends Person{//定义了一个子类
	private String school;
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}
}
public class Practice22{
	public static void main(String [] args){
		Student student=new Student();
		student.setName("Tom");
		student.setAge(18);
		student.setSchool("大学");
		System.out.println("姓名:"+student.getName()+"  年龄:"+student.getAge()+"  学校:"+student.getSchool());
	}
}
