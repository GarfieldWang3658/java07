public class MethodDetail02{
	public static void main(String[] args) {
		
		A a = new A();
		//a.sayOK();

		a.m1();

	}
}

class A{
	//同一个类中的方法调用：直接调用即可
	//不需要创建对象。

public void print(int n ){
		System.out.println("print()方法被调用n="+n);
	}
public void sayOK(){//sayok 调用 print()
	print(10);
		System.out.println("继续执行sayOK（）~~~~~");

}
//跨类中的方法A类调用B类方法：需要通过对象名调用。
public void m1(){
	//先创建一个B的对象
	System.out.println("m1方法被调用");//1

	B b = new B();
	b.hi();

	System.out.println("m1()继续执行：）");//3


}

}

class B{

	public void hi(){
		System.out.println("B类中的hi()被执行");//2
	}

}