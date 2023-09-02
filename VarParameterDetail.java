public class VarParameterDetail{
	public static void main(String[] args) {

		int[]arr={1,2,3};
		T t1 = new T();
		t1.f1(arr);

	}
}

class T{
	public void f1(int...nums){
		System.out.println("长度="+nums.length);

	}
	public void f2(String str,double...nums){
		//可变参数需要在最后。

	}
	// public void f3(int...nums1,double...nums2){
	// 	//最多只能出现一个可变参数
	// 	//因此这个是错误的

	// }
}
