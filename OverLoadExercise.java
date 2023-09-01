public class OverLoadExercise{
	public static void main(String[] args) {
		Methods a = new Methods();
		int f =a.m(3);
		int b =a.m(3,4);
		String c = a.m("123");

		System.out.println(f);
		System.out.println(b);
		System.out.println(c);

		int g = a.max(8,5);
		double t = a.max(33.2,55.4);
		double x = a.max(23.34,234.32,500);
		//没有发生自动转换的方法，匹配优先级更高。

		System.out.println(g);
		System.out.println(t);
		System.out.println(x);

	}
}
class Methods{
	public int m(int a){
		return a*=a;


	}
	public int m(int a,int b){
		return a*b;
	}
	public String m(String a){
		return a;


	}
	public int max(int a , int b){
		// if (a>b) {
		// 	return a;
		// }else if (a<b) {
		// 	return b;
		// }else{
		// 	return a;
		// }
		return a>b?a:b;

	}
	public double max(double a,double b){
		// 	if (a>b) {
		// 	return a;
		// }else if (a<b) {
		// 	return b;
		// }else{
		// 	return a;
		// }
		return a>b?a:b;
	}
	public double max(double a,double b,double c){
	double max1=a>b?a:b;
	return max1>c?max1:c;
	}
}