public class VarScope{
	public static void main(String[] args) {
		
	}
}
class cat{

	//全局变量：也就是属性作用域为整个类体，
	//属性在定义时，可以直接赋值。

// 	1、在java中，主要的变量就是属性（成员变量）和局部变量。
// 2、我们说的局部变量一般是指在成员方法中定义的变量
// 3、java中的作用域的分类
// 全局变量：也就是属性，作用域为整个个类体
// 局部变量：除了属性之外的其他变量，作用域为定义它的代码块当中。
// 4、全局变量可以不赋值，直接使用，因为有默认值，局部变量必须符之后才能使用，没有默认值。

	//属性在定义时，可以直接赋值
	int age =10;//指定的值是10；
	public void cry(){
		//1、局部变量一般是指在成员方法中定义的变量
		//2、n 和 name 就是局部变量
		//3、n 和 name作用域在cry方法中
		int n =10;
		String name = "jack";
		System.out.println("在cry中使用属性 age="+age);
	}
	public void eat(){
		System.out.println("在eat中使用属性 age="+age);

	}
}