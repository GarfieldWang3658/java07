public class VarParameter01{
	public static void main(String[] args) {
		HspMethod m = new HspMethod();
		System.out.println(m.sum(3,4,5,6,7,8));
			System.out.println(m.sum(23123,123123));
	}
}
class HspMethod{
	//方法名称相同，功能相同，参数个数不同-》使用可变参数优化
	public int sum(int...nums){
		int res =0;
		//int...表示可以接受的是可变参数，数据类型是int，即可以接受多个int（0-多）
		//使用可变参数时，可以当做数组来使用，即nums可以当作数组
		//遍历求和
		System.out.println("接收的参数个数"+nums.length);
		for (int i = 0;i<nums.length ;i++ ) {
			res+=nums[i];
			
		}

		return res;


}
}