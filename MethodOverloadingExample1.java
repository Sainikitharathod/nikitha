//Method overloading is defining several methods in a class having the same method name and differnt parameters list

class MethodOverloadingExample1
{
	int r1,r2;
	double r3;
	public int add(int n1,int n2,int n3)
	{
		return r1=n1+n2+n3;
	}
	public int add(int n1,int n2)
	{
		return r2=n1+n2;
	}
	public double add(double n1)
	{
		return r3=n1;
	}
}
class Demo
{
	public static void main(String ar[])
	{
		MethodOverloadingExample1 obj= new MethodOverloadingExample1();
		int r1=obj.add(3,4,5);
		int r2=obj.add(3,4);
		double r3=obj.add(20.11);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}