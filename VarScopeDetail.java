public class VarScopeDetail{
	public static void main(String[] args) {
		Person p1 = new Person();

		// 属性生命周期较长，伴随着对象的创建而创建，伴随对象的销毁而销毁，局部变量生命周期较短，
		// 伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁，即在一次方法调用过程中。

		//p1.say();//当执行say方法时，say方法的局部变量比如name 会创建，当say执行完毕后
		//name局部变量就销毁了。但属性（全局变量）仍然可以使用。
		T t1 =new T();
		t1.test();//第一种跨类
		t1.test2(p1);//把p1作用域的person传给test2，第二种跨类方式


		}
	}
	class T{
		public void test(){
			Person p1 = new Person();
			System.out.println(p1.name);//jack
		}
		public void test2(Person p){
			System.out.println(p.name);
		}
	}
	class Person{
		String name ="jack";
		public void say(){
			String name ="king";
			System.out.println("say()name"+name);
			//属性和局部变量是可以重名的，方式时遵循就近原则，
		}
		public void hi(){
			String address = "北京";
			//String address = "上海";//（X），重复定义变量
			String name ="hsp";//可以
		}
	}
