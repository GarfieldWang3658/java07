import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入数组的元素个数");
		int i = myScanner.nextInt();

		String[] arry = new String[i];

		for (int j =0;j<arry.length ;j++ ) {

			System.out.println("请输入当前元素");

			arry[j]=myScanner.next();

		}
			System.out.println("请输入要查找的元素");
			
			String find =myScanner.next();

			A02 a = new A02();

			int index=a.find(find,arry);

			if (index!=-1) {
			System.out.println("查找的元素在第"+index+"个位置");
		}else{
			System.out.println("未找到"+find+"元素");

		}


	

	}
}

class A02{
	public int find(String find,String[]arry){
		int index = 0;
		for (int i =0;i<arry.length ;i++ ) {
			index++;
			if (arry[i].equals(find)) {
			 	return index ;
			 }
			}return -1;

			}
			}