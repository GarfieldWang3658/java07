public class MethodParameter02{
	public static void main(String[] args) {

		B b =new B();
		// int[]arr={1,2,3};
		// b.Test100(arr);
		// System.out.println("main的arr数组");


		// for (int i =0;i<arr.length ;i++ ) {
		// 	System.out.print(arr[i]+" ");
		// }
		
		Person p = new Person();

		p.name ="jack";
		p.age = 10;

		b.Test200(p);//把对象的地址传给了test200，因此共享了一个空间。

		System.out.println("p.age="+p.age);

		//如果test200，p=null，p.age=10

		//如果test200，p=new Person();。。。。输出p.age =10



	}
}
// class B{
// 	public void Test100(int[]arr){
// 		arr[0]=200;
// 		System.out.println("Test100的arr数组");

// 		for (int i =0;i<arr.length ;i++ ) {
// 		System.out.print(arr[i]+" ");
// 		}
// 	System.out.println("");
// 	}	
// }
class Person{

String name;
int age;
}

class B{

public void Test200(Person p){
	//p.age=10000;//修改对象属性
	//思考题1:
	//p = null;
	//思考题2:
	p = new Person();
	p.name="Tom";
	p.age =99;

}
}

//数组是一个地址，