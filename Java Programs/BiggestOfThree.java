import java.util.*;
public class BiggestOfThree{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Number : ");
		
		int num1 = sc.nextInt();

		System.out.println("Enter your Second Number : ");
		
		int num2 = sc.nextInt();

		System.out.println("Enter your Third Number : ");
		
		int num3 = sc.nextInt();

		//logic  num1 =10 ,num2=7 ,num3= 12.
		
		if(num1>num2 && num1>num3){
			System.out.println(num1 + " is greater than " + num2 + " and " + num3);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2 +" is greater than "+ num1 + " and "+ num3);

		}else if(num3>num1 && num3>num2){

			System.out.println(num3 +" is greater than "+ num2 + " and "+ num1);

		}else{
			System.out.println(num1 + " , " + num2 + " and " + num3 +" are equal");
		}	


	}

}