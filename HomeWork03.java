import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入书名");
		String name = myScanner.next();
		System.out.println("请输入书本价格");
		double price = myScanner.nextDouble();
		Book b= new Book(name,price);
		b.info();
        b.updatePrice(b.price);
		b.info();
	}
}

class Book{
	String name;
	double price;
	public Book(String name,double price){
		this.name=name;
		this.price=price;
	}

	public void updatePrice(double price){
		//如果方法中没有price局部变量，this.price 等价price
		if (this.price>150) {
			this.price=150;
		}else if (this.price>100 && this.price<=150) {
			this.price=100;
		}
	}
	//显示书籍的情况。

	public void info(){
		System.out.println("书籍的名称为"+this.name+"书籍的价格为"+this.price);
	}
}