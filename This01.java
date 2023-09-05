public class This01{
	public static void main(String[] args) {
		Dog dog1 = new Dog("大壮",3);
		//dog1.info();
		System.out.println("dog1的hashcode=" + dog1.hashCode());
	    Dog dog2 = new Dog("大黄",2);
		// dog2.info();
		System.out.println("dog2的hashcode=" + dog2.hashCode());

	}
}

class Dog{
	public String name;
	public int age;
	// public Dog(String dName,int dAge){//构造器
	// 	name = dName;
	// 	age = dAge;
	// }//如果构造器的形餐，能够直接写成属性名，就更好了。
	//但是根据变量的作用域原则，
	//构造器的name就是局部变量，而不是属性name。
	//构造器的age就是局部变量，而不是属性age。
	//==》引出 this 关键字来解决。
		public Dog(String name,int age){//构造器
		this.name = name;//当前对象的属性
		System.out.println("this的hashcode=" + this.hashCode());
		//谁在调用这个构造器，谁的对象就是this代表的对象。
		this.age = age;//当前对象的属性
		//System.out.println();
	}
	public void info(){//成员方法，输出成员属性信息。
	
		System.out.println(name+"\t"+age+"\t");
}
}