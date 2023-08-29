public class Method02{
	public static void main(String[] args) {
		int[][]map={{0,0,1},{1,1,1},{1,1,3}};
		//遍历map数组
		//传统的解决方式就是直接遍历
		
		//使用方法完成输出
		//创建MyTools对象
		MyTools myTools = new MyTools();
		//MyTools是类名
		//tools是方法名


		// for (int i= 0;i<map.length ;i++ ) {
		// 	for (int j = 0;j<map[i].length ;j++ ) {
				
		// 		System.out.print(map[i][j]+" ");
				
		// 	}
		// 	System.out.println(); 
		// }

	   myTools.printArr(map);

	   myTools.printArr(map);

	   myTools.printArr(map);


//把输出的功能，写到一个方法中，然后调用方法即可。

	}
}

		class MyTools{
			//方法，接收一个二维数组
			public void printArr(int[][]map){
				//对传入的map数组进行遍历输出

				System.out.println("==========");

		for (int i= 0;i<map.length ;i++ ) {
		for (int j = 0;j<map[i].length ;j++ ) {
				
		System.out.print(map[i][j]+"\t");
	}
	System.out.println();
}
}
}