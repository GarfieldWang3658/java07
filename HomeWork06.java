import java.util.Scanner;
public class HomeWork06{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入num1的数字");

		double num1 =myScanner.nextDouble();

		System.out.println("请输入num2的数字");

		double num2 =myScanner.nextDouble();

		// System.out.println("请输入num3的数字");

		// double num3 =myScanner.nextDouble();

		// System.out.println("请输入num4的数字");

		// double num4 =myScanner.nextDouble();

		Cale a = new Cale(num1,num2);

		System.out.println("和=" + a.plus());
		System.out.println("差=" + a.reduce());
		System.out.println("积=" + a.ride());
		Double num = a.except();
		System.out.println("商=" + num);


		// Cale b = new Cale(num3,num4);

		// System.out.println("和=" + b.plus);
		// System.out.println("差=" + b.reduce);
		// System.out.println("积=" + b.ride);
		// System.out.println("商=" + b.except);

	}
}
class Cale{
	double num1;
	double num2;

	public Cale(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}


	public double plus(){
		return num1+num2;

	}
	public double reduce(){

    	return num1-num2;


	}
	public double ride(){

		return num1*num2;

	}
	public Double except(){

		if (num2==0) {
			System.out.println("不能为0");
			return null;
		}else{

		return num1/num2;
	}

	}
}