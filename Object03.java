public class Object03{
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小明";

		Person p2 = p1;//把p1赋给p2，

		p1.age =80;

		System.out.println(p2.age);//80

	


	}
}
	class Person {
			String name;//属性/成员变量/field（字段）；
			int age;
		
		}