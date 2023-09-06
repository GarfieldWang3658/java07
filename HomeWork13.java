public class HomeWork13{
	public static void main(String[] args) {
		Cirle c = new Cirle();
		PassObject p1 = new PassObject();
		p1.printAreas(c,5);
	}
}

class Cirle{
	double radius;

	public Cirle(){}

	public Cirle(double radius){
		this.radius=radius;
	}

	public double findAreas(){
		return Math.PI*radius*radius;
	}
	public void RadiusSet(double radius){//方法是修改当前对象的半径值
		this.radius = radius;
	}
}
class PassObject{
	public void printAreas(Cirle c,int times){
		double Area = 0;
		System.out.println("Radius"+"\t"+"Area");
		for (int i =1;i<=times ;i++ ) {//输出1到times之间的每个整数半径
			
			c.RadiusSet(i);//修改c 对象的半径值

			c.findAreas();



			System.out.println((double)i+"\t"+c.findAreas());

			
		}
	}
}