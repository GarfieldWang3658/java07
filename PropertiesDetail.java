public class PropertiesDetail{
	public static void main(String[] args) {

		//创建Person对象
		//p1是对象名（对象引用）
		//new Person()创建的对象空间(数据)才是真正的对象。

		Person  p1 = new Person();

		//对象属性的默认值，遵守数组的规则


		System.out.println("\n当前这个人的信息");

		System.out.println("age="+p1.age+"name"+p1.name+
			"sal"+p1.sal+"isPass"+p1.isPass);

	}
}

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;

}
