import java.util.Scanner;
public class RecursionExercise02{
	public static void main(String[] args) {
		T t1 = new T();

		Scanner myScanner = new Scanner(System.in);
		System.out.println("第几天？（1-10）");
		int day = myScanner.nextInt();

		int peachNum = t1.peach(day);

		if (peachNum != -1 ) {
			System.out.println("第"+day+"天有"+peachNum+"个桃子");
		
		}
		

		//猴子吃桃
		//思路分析
		//每天=n/2-1
		//1+1*2=第9天


	}
}

class T{
	public int peach(int day){
		if (day == 10) {
			return 1;
			
		}else if (day>=1 && day<=9) {
			return(peach(day+1)+1)*2;

			
		}else{
			System.out.println("day在1-10");
			return -1;
		}

	}
}