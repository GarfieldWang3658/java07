public class Constructor01{
	public static void main(String[] args) {
	//当new一个对象的时候，直接通过构造器指定名字和年龄。
	Person p1 = new Person("Smith",80);	

	System.out.println("p1对象的信息如下");
	System.out.println("p1对象name="+p1.name+"p1对象age="+p1.age);


	}
}
class Person{
	String name;
	int age;
	//构造器
	//1、构造器没有返回值，不写void
	//2、构造器的名称和类名一样。
	//3、构造器的形参列表规则和成员方法一样

	public Person(String pName,int pAge){
		System.out.println("构造器被调用~完成对象属性的初始化。");
		name = pName;
		age = pAge;
		
	}
}