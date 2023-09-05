import java.util.Scanner;
public class HomeWork01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入数组的元素个数");

		int i = myScanner.nextInt();

		double[] arry = new double[i];

		for (int j =0;j<arry.length ;j++ ) {

			System.out.println("请输入当前元素");

			arry[j]=myScanner.nextDouble();
		}

		A01 a = new A01();

	    Double max =  a.max(arry);

	    if ( max != null) {
	    	System.out.println("arry的最大值为"+max);
	    	
	    }else{
	    	System.out.println("输入有误");
	    }



	}
}
class A01{
	public Double max(double[]arry){
		//保证arry 至少有一个元素；
		if (arry != null && arry.length>0) {
		
		double max = arry[0];
		for (int i =0;i<arry.length ;i++ ) {
			if (max < arry[i]) {	
			max=arry[i];
			
			}
		}
		return max;
	}else{
		return null;
	}
	}

}
