public class HomeWork12{
	public static void main(String[] args) {
		Employee man = new Employee("wangyang",'男',35,"会社员",1234);
		
	}
}
class Employee{
	String name;
	char sex;
	int age;
	String job;
	double sal;


		public Employee(String name,char sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;

		}
		public Employee(String job,double sal){
		this.job=job;
		this.sal=sal;

		}
		public Employee(String name,char sex,int age,String job,double sal){
		// this.name=name;
		// this.sex=sex;
		// this.age=age;
		// this.job=job;
		// this.sal=sal;
		this(name,sex,age);
		this.job=job;
		this.sal=sal;
		//this调用构造器时 必须放在构造器的第一条。

	}
}
