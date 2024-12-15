import java.util.*; // #include<stdio.h>
public class DataType{
	public static void main(String args[]){

		int num1 = 10 ;
		int num2 = 15 ;
		int addition = num1 + num2 ;
		System.out.println(num1 + " + " + num2 + " = " + addition); // here we are adding to  number
		//scanf("%d + %d = %d",num1,num2,addition);
		//+ , - , * , / , % 
		//System.out.println(num1 > num2);
		Car c1 = new Car();
		System.out.println(c1 instanceof Car);
		 // to get a user input 
		Scanner sc = new Scanner(System.in); // create a object of Scanner class
			System.out.println("Please Enter your Number");
		//int userInput = sc.nextInt(); // to take a int type data we have to use nextInt() method of Scanner class
		long d = sc.nextLong();
		System.out.println("UserInput" + d);
		nextInt();
		nextLong();
		nextShort();
		nextByte();
		nextDouble();
		nextFloat();
		nextLine(); // to get a userinput of type String
		next(); // String a user data    // while studying String we will elaborate nextLine and next method

			
	}

}


