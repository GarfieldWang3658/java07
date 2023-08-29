import java.util.Scanner;
public class MethodExercise01{
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入数字");

		int num  = myScanner.nextInt();

		AA a = new AA();

	if(a.isOdd(num)){//这样的
	 	System.out.println("是奇数");
    }else{
	 	System.out.println("是偶数");
	 }
	 	System.out.println("");

		System.out.println("输入行数");
		
		int num1  = myScanner.nextInt();
		
		System.out.println("输入列数");

		int num2 = myScanner.nextInt();

		System.out.println("输入字符");

		char n = myScanner.next().charAt(0);

		a.print(num1,num2,n);


	}
}
//1、方法的返回类型，boolean
//2、方法的名字 isOdd
//3、方法的形参 （int num）
//4、方法体


class AA{//类名称
	public boolean isOdd(int num){//返回类型boolean，方法名isOdd
	 if (num % 2  != 0) {
	 	return true;
	 } else {
	 	return false;
	 }

	}
	//return num%2!=0? true;false;
	//return num % 2 !=0;

	//1、方法的返回类型，因为直接打印，没有返回类型，使用void
	//2、方法的名字，print 

	 public void print(int num1,int num2,char n){//形参为在方法中的数据类型，和变量名称
	 	for (int i = 0;i<num1 ;i++ ) {
	 		for (int j = 0;j<num2 ;j++ ) {//输出每一行
	 			System.out.print(n);
	 			

	 		}
	 		System.out.println();//换行
	 	}
	 }

}
