import java.util.Scanner;
public class RecursionExercise01{
	public static void main(String[] args) {
		T t1 = new T();

		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入整数n(n>=1)");
		int n = myScanner.nextInt();
		for (int i =1;i<=n ;i++ ) {
					
		int res = t1.fibonacci(i);
		if (res != -1) {
			
			System.out.println("当n="+i+"fibonacci数="+res);
		 }else{

		}
}

	}
}

class T{
	public int fibonacci(int n){
		if (n >= 1) {
			
		if (n==1||n==2) {
			return 1;
		}else{

			return fibonacci(n-1)+fibonacci(n-2);

		}
	}else{
		System.out.println("要求输入的n>=1的整数");
		return -1;
	}

	}
}