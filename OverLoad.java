public class OverLoad{
	public static void main(String[] args ) {
		// System.out.println(100);
		// System.out.println("HelloWord");
		// System.out.println('h');
		// System.out.println(1.1);
		// System.out.println(true);
		 //out 是 PrintStream的对象
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1,2));
	}
}
class MyCalculator{
	public int calculate(int n1,int n2){
		return n1+n2;
	}
	public double calculate(int n1, double n2){
		return n1+n2;
	}
	public double calculate(double n2, int n1){
		return n1+n2;
	}
	public int calculate(int n1, int n2, int n3){
		return n1+n2+n3;
	}
	
}