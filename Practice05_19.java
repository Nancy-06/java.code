class Person{
  public String name;
  public int age;
  public Person(String name,int age){
  this.name = name ;
  this.age = age ;
}
//public Person{};
public String getPersonInfo(){
return "姓名： "+this.name+",年龄： "+this.age;
}
}
public class Practice05_19{
	public static void main(String [] args){
		//Person p1 = new Person();
        //Person p2 = new Person("Steven",25);
		Person p = new Person("Steven",25);
        System.out.println(p.name);
		System.out.println(p.age);
        System.out.println(p.getPersonInfo());
}
}