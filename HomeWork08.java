public class HomeWork08{
	public static void main(String args[]) {
		//new Test() 是匿名对象，使用后就不能使用了
		new Test().count1();//输出10
		Test t1 = new Test();//创建好匿名对象后，就调用count1
		t1.count2();//9
		t1.count2();//10

}
}
class Test{
		int count = 9;
		public void count1(){
			count = 10;//9=》10，count属性 由9改到10；
			System.out.println("count1="+count);//10
		}
		public void count2(){
			System.out.println("count1="+count++);
		}

	}


