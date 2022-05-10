package java8_features;

@FunctionalInterface   //It should have only a single method
interface MyFI
{
	public String sayHello();
	//public String sayHello1();
}

public class LambdaDemo1 
{

	public static void main(String[] args)
	{
		MyFI msg = () -> {return "Hello World";}; //lambda expression
		
		System.out.println(msg.sayHello()); 
	}
}
