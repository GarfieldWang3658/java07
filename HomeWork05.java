import java.util.Scanner;
public class HomeWork05{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入圆的半径");
		double radius = myScanner.nextDouble();
		Circle c = new Circle(radius);
		
		System.out.println("圆的周长为"+c.perimeter());
		System.out.println("圆的面积为"+c.area());
	}
}
class Circle{
	double radius; 
	

	public Circle(double radius){
	this.radius=radius;
	
}
	public double perimeter(){//周长
		return 2*Math.PI*radius;

	}
	public double area(){//面积
		return Math.PI*radius*radius;
	}

}