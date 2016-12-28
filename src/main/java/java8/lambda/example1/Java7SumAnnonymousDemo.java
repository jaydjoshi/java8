package java8.lambda.example1;



public class Java7SumAnnonymousDemo {

	public static void main(String[] args) {
		//type 2
		//we will create an annonymous implementation of calculate interface and use calculate method to find sum of two numbers
		CalculateInterface calc = new CalculateInterface() {
			@Override
			public int calculate(int num1, int num2) {
				return num1+num2;
			}
		};
		System.out.println("Sum of two numbers using annonymous inner class is "+calc.calculate(10, 5));
	}

}

