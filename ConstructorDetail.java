public class ConstructorDetail{
	public static void main(String[] args) {
		Person p1=new Person("king",50);
		Person p2=new Person("Tom");

		System.out.println(p1.name+" "+p1.age);

		System.out.println(p2.name+" "+p2.age);

		Dog dog1 = new Dog();//使用的是默认的无参构造器


	}
}
class Dog{
	//默认构造器
	public Dog(String dName){
	}
	public Dog(){}//显式的定义无参构造器
}
class Person{
	String name;
	int age;
	//第一个构造器
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;

	}
	//第二个构造器,重载
	public Person(String pName){
		name = pName;
	}
}