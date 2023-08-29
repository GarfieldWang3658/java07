public class MethodExercise02{
	public static void main(String[] args) {
		//

		Person p = new Person(); 
		p.name = "milan";
		p.age = 100;

		//创建一个tools对象

		MyTools tools = new MyTools();




		//tools.copyPerson（p），把p传进copyPerson，

		//Person p2 = tools.copyPerson(p)接收一个返回的对象，Person p2

		Person p2 = tools.copyPerson(p);

		//到此 p和p2都是Person对象，但是是两个独立的对象。属性相同。

	System.out.println("p的属性="+p.age+"名字="+p.name);
	System.out.println("p2的属性="+p2.age+"名字="+p2.name);
	System.out.println(p==p2);
	//可以通过对象比较看看是否为同一个对象。
	}
}
class Person{
	String name;
	int age;
}
class MyTools{
	//1、确定返回类型
	//2、方法名字
	//3、方法的形参
	//4、方法体，创建一个新渡乡，并复制属性，返回即可
	public Person copyPerson(Person p){
		//创建一个新的对象

		Person p2 = new Person();
		p2.name = p.name;//把原来的对象的名字赋给p2.name
		p2.age = p.age; //把原来对象的年龄赋给p2.age
		return p2;

	}
}