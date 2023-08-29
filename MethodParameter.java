public class MethodParameter{
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		AA c = new AA();
		c.swap(a,b);
	System.out.println("main方法a="+a+"b="+b);//a=10,b=20

	}
}

class AA{
	public void swap(int a,int b){//a和b，作用空间不同，不会冲突。
		System.out.println("\na和b交换前的值\na="+a+"\tb="+b);//a=10,b=20
		//完成了 a 和 b 的交换
		int temp =a;
		a=b;
		b=temp;
		System.out.println("\na和b交换后的值\na="+a+"\tb="+b);//a=20,b=10
	}
}