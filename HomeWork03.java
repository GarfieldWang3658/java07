import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {
		Book b=new Book();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入书本价格");
		double price = myScanner.nextDouble();
		System.out.println("更改后的书本价格为" + b.updatePrice(price));
	}
}

class Book{
	public double updatePrice(double price){
		if (price>150) {
			price=150;
		}else if (price>100&&price<150) {
			price=100;
		}
		return price;
	}
}