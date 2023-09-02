import java.util.Scanner;
public class VarParameterExercise{
	public static void main(String[] args) {
HspMethod hm = new HspMethod();
Scanner myScanner = new Scanner(System.in);

System.out.println("请输入你的名字");
String name = myScanner.next();

System.out.println(hm.showScore(name , 11.1,123.1,213.1,231,341));

}
}
	


class HspMethod{
	public String showScore(String str,double...nums){

		double sum = 0;
		for (int i =0;i<nums.length ;i++ ) {
			sum+=nums[i];
		}
		return str+"有"+nums.length+"门课的总分为"+sum;

	}
}