import java.util.Scanner;
public class HanoiTower{
	public static void main(String[] args) {
		
		Tower tower = new Tower();
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入有多少个盘");

		int num = myScanner.nextInt();

		tower.move(num,'A','B','C');




	}
}

class Tower{
	//方法
	//num表示系统的个数，a，b，c，分别表示A塔，B塔，C塔
	public void move(int num ,char a ,char b ,char c){
		//如果只有一个塔 num =1
		if (num == 1) {
			System.out.println(a+"->"+c);
			
			
		}else{
			//如果有多个盘，可以看成2个，最下面的和上面的所有盘
			//（1）先移动上面所有的盘到char b 借助c
			move(num-1,a,c,b);
			//(2)把最下面的盘，移动到C
			System.out.println(a+"->"+c);
			//(3)再把b塔所有的盘移动到c，借助a
			move(num-1,b,a,c);
		}


	}
}