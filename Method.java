public class Method{
	public static void main(String[] args) {

		//方法的使用
		//1、方法写好后，如果不去调用，不会输出/生效。
		//2、先创建一个对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();//调用方法/使用方法；
		p1.cal01();//调用cal01方法；
		p1.cal02(5);//调用cal02方法，同时给n = 5；
		p1.cal02(10);//调用cal02方法，同时给n = 10；
        //调用了getsum方法，同时给num1赋值10，num2赋值20，
        //把方法 getsum 返回的值，赋给 变量 returnRes

		int returnRes=p1.getsum(10,20);
		System.out.println("getsum方法返回的值="+returnRes);

	}
}

class Person{

	int age;
	String name;
	//方法（成员方法）

	//1、public 表示方法是公开的。
	//2、void：方法没有返回值
	//3、speak() ：spek是方法名，（）形参列表
	//4、{}方法体，可以写我们要执行的代码。
	//5、输出：System.out.println("我是一个好人");
	//表示我们的方法就是输出一句话。
	public void speak(){
		System.out.println("我是一个好人");
	}
	//添加一个cal01 成员方法，可以计算从1+。。。。+1000的结果。
	public void cal01(){
		int sum = 0;
		for (int i = 1;i<=1000 ;i++ ) {
			sum+=i;
		}
		System.out.println("cal01计算结果="+sum);
	}
    //在添加cal02的成员方法，该放啊可以接受一个数n，计算1+。。n的结果
	//()行参列表，表示当前一个形式参数（形参）n，可以接受用户的输入。
	public void cal02(int n){
			int sum = 0;
		for (int i = 1;i<=n ;i++ ) {
			sum+=i;
		}
		System.out.println("cal02计算结果="+sum);

	}
	//1、public 表示方法是公开的。
	//2、int :表示方法执行后，返回一个 int 值
	//3、getsum 方法名
	//4、（int num1 int num2）形参列表，2个形参，可以接收用户传入的两个数
	//5、return res ； 表示把 res 值，返回。
	public int getsum(int num1,int num2){
		int res = num1 + num2;
		return res;

	}

}