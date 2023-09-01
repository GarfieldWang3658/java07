public class MiGong{
	public static void main(String[] args) {
		//思路
		//1、创建迷宫，用二维数组表示int[][]map= new int[8][7]
		//2、先规定，map数组的元素值：0表示可以走，1表示障碍物

		int[][]map = new int[8][7];

		//3、将最上面的一行和最下面的一行全部设置为1

		for (int i=0;i<7 ;i++ ) {
			map[0][i]=1;
			map[7][i]=1;
				
			}
			for (int i=0;i<8 ;i++ ) {
			map[i][0]=1;
			map[i][6]=1;
				
			}
			map[3][1]=1;
			map[3][2]=1;
			// map[2][1]=1;
			map[2][2]=1;//测试回朔现象
			// map[1][2]=1;

			System.out.println("===当前地图情况===");

		for (int i =0;i<map.length ;i++ ) {
			for (int j =0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j]+" ");
				
			}
			System.out.println();
		}
		T t1 = new T();
		t1.findway(map,1,1);

		System.out.println("\n===找路的情况如下===");


		for (int i =0;i<map.length ;i++ ) {
			for (int j =0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j]+" ");
				
			}
			System.out.println();


	}
}
}
class T{
	//使用递归回朔的思想来解决老鼠出迷宫
	//1、fiandway方法就是专门用来找出迷宫的路径
	//2、如果找到就返回true，如否则返回false
	//3、map就是二维数组，即表示迷宫
	//4、i，j是老鼠的位置坐标，初始化的位置为（1，1）
	//5、因为是递归的找路，所以要找出退出的条件。
	//  0表示可以走，1表示障碍物，2表示可以走，3表示走过但是是死路（走不通）
	//6、当map[6][5]=2,就说明找到通路了，就可以结束，否则就继续找。
	//7、先定一个找路的策略 下-> 右-> 上-> 左

	public boolean findway(int[][]map,int i, int j){
		if (map[6][5]==2) {
			return true;
			
		}else{
			if (map[i][j] == 0) {//当前位置为0，表示可以走，但是还没走过。
				//假定可以走通
				map[i][j] = 2;
				//使用找路的策略来确定该位置是否真的可以走通。
				if (findway(map,i+1,j)) {//先走下
					return true;
					
				}else if (findway(map,i,j+1)) {//向右
					return true;
					
				}else if (findway(map,i-1,j)){//向上
					return true;
				}else if (findway(map,i,j-1)){//向左
					return true;
				}else {
					map[i][j]=3;
					return false;
				}
			} else {//map[i][j]=1(障碍物) ,2（可以走，但走过） ,3（死路）
				return false;

			}
		}
	}
	//修改找路策略，看看路径是否有变化。
	//上-》右-〉下-》左
public boolean findway2(int[][]map,int i, int j){
		if (map[6][5]==2) {
			return true;
			
		}else{
			if (map[i][j] == 0) {//当前位置为0，表示可以走，但是还没走过。
				//假定可以走通
				map[i][j] = 2;
				//使用找路的策略来确定该位置是否真的可以走通。
				if (findway2(map,i-1,j)) {//向上
					return true;
					
				}else if (findway2(map,i,j+1)) {//向右
					return true;
					
				}else if (findway2(map,i+1,j)){//向下
					return true;
				}else if (findway2(map,i,j-1)){//向左
					return true;
				}else {
					map[i][j]=3;
					return false;
				}
			} else {//map[i][j]=1(障碍物) ,2（可以走，但走过） ,3（死路）
				return false;

			}
		}
	}
}
//【重要】
//找到退出的路径
//指定规则，什么数据表示审核含义
//要有一个行动策略
//求出最短路径
//方法：1、穷举法，把小球的策略记录，把路径继续下来。
//方法：2、图-》求出最短路径

