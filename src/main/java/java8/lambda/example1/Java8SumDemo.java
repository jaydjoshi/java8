package java8.lambda.example1;

/*
 * 
 * 
Syntax of lambda?

ReturnType returnType = (num1,num2) -> {
			return num1+num2;
		      }

Syntax:
(arg1,arg2) -> { Body }
(arg1,arg2) ->  Single line Body 
arg1 ->  Single line Body 

 */
public class Java8SumDemo {

	public static void main(String[] args) {
		//type 3
		//we will create an lambda expression implementation of calculate interface and use calculate method to find sum of two numbers
		CalculateInterface calc = ( num1, num2) -> num1+num2;
		display(calc);
		
	}

	private static void display(CalculateInterface calc) {
		System.out.println("Sum of two numbers using lambda expression is "+calc.calculate(10, 5));
	}

}

