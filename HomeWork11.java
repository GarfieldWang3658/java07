public class HomeWork11{
	public static void main(String[] args) {
		Method m = new Method();
		m.method(10.0,20.0);
			System.out.println(m.method(10.0,20.0));


		

	}
}

class Method{
	public double method(double num1,double num2){
		return method(method(num1,num2),100);
}

}