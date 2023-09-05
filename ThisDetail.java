public class ThisDetail{
	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();
	}

}

class T{
	//细节：访问构造器的语法： this（参数列表）;
	//注意只能在构在器中使用（即只能在构造器中访问另外一个构造器）
	//注意：访问构造器的语法，this（参数列表）；必须放置在第一条语句。

	String name = "jack";
	int num = 10;


	public T(){
		this("jack",100);//必须放置在第一条语句。
		System.out.println("T()构造器");
		//在这里去访问T(String name,int age)构造器
	
	}
	public T(String name,int age){
		System.out.println("T(String name,int age)构造器");

	}

	//细节：访问成员方法的语法：this.方法名(形参列表);

	public void f1(){
		System.out.println("f1()方法..");

	}

	public void f2(){
		System.out.println("f2()方法..");
		//调用本类的f1
		//第一种方法
		f1();
		//第二种方法
		this.f1();
	}
	public void f3(){
		String name = "Simth";
		int num = 123;
		System.out.println("name = "+name+"num = "+num);
		System.out.println("name = "+this.name+"num = "+this.num);
	}


} 

