package java8.lambda.example1;

public class Java7SumDemo {

	public static void main(String[] args) {
		//type 1
		//we will create an implementation of calculate interface and use calculate method to find sum of two numbers
		CalculateImpl calc = new CalculateImpl();
		System.out.println("Sum of two numbers is "+calc.calculate(10, 5));
	}

}

class CalculateImpl implements CalculateInterface {

	@Override
	public int calculate(int num1, int num2) {
		return num1+num2;
	}
	
}
