public class Object01{
	public static void main(String[] args) {

		// //用单独的变量

		// String cat1Name = "小白"；
		// String cat2Name = "小花";

		// int age1 = 3;
		// int age2 = 100;
		
		// String cat1Color = "白色";
		// String cat2Color = "花色";

		// //用单独变量来解决，=》不利于数据管理
		// //把猫的信息拆解了。

		// String[] cat1 = {};
		// String[] cat2 = {};
		//数据类型无法得到有效体现
		//失去了变量名和内容的关联关系，只能通过下标获取信息。
		//名字和内容的对应关系不明确
		//不利于数据管理，效率低。

		//使用面向对象来解决

		//定义一个猫类 Cat -> 自定义的数据类型
		//1、使用oop解决
		//2、实例化一只猫【创建一只猫对象】
		//3、cat1就是一个对象
			class Cat {
			//属性
			String name;//
			int age;//年龄
			String color;//颜色
			int weight;//体重
			//行为可以添加

		}


		Cat cat1 = new Cat();//创建一只猫
		//把创建的猫 赋值给cat1，cat1代表这只猫
		cat1.name ="小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight =10;

		//cat2也是一个对象

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20;

		System.out.println("第一支猫的信息"+cat1.name+
			" "+cat1.age+""+cat1.color+" "+cat1.weight);
		System.out.println("第二支猫的信息"+cat2.name+
			" "+cat2.age+""+cat2.color+" "+cat2.weight);

	}
}