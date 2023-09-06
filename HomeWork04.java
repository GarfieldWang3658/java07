import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args) {
		A03 arr = new A03();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数组的元素个数");
		int n = myScanner.nextInt();
		int[]arry=new int[n];
		for (int i =0;i<arry.length ;i++ ) {
		System.out.println("请输入第"+(i+1)+"个元素");
		arry[i]= myScanner.nextInt(); 
		 } 

		 int[]newarry = arr.copyArr(arry);
		 for (int i = 0;i<newarry.length ;i++ ) {
		 	System.out.println("新数组第"+(i+1)+"个元素为"+newarry[i]);

		 }


	}
}

class A03{
	public int[] copyArr(int[]arry){
		int[]arr=new int[arry.length];
		for (int i =0;i<arry.length ;i++ ) {
			arr[i]=arry[i];
		
		}	return arr;
	}

}