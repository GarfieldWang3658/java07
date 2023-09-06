public class HomeWork07{
	public static void main(String[] args) {
		Dog dog = new Dog("大黄" , '黄' , 4);
		dog.show();
	}
}

class Dog{
	String name;
	char color;
	int age;

	public Dog(String name,char color,int age){
		this.name = name;
		this.color = color;
		this.age = age;

	}

	public void show(){
		System.out.println("小狗的名字是"+this.name+",颜色是"+this.color+",今年"+this.age+"岁了");
	}
}