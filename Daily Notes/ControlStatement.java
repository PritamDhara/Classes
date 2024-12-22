public class ControlStatement{

	public static void main( String args[]){
		
		//if  - > based on a condition i want execute some code  if(condition){ <code to be executed> }
		
		int num = 5;
		
		if(num<5){
			System.out.println("The given number is less than 5 ");
		}

		//if-else  ->  if(condition){if true then this block will execute } else {if false then this block will execute }
		
			if(num<5){
			 System.out.println("The given number is less than 5 ");
			}else{
				System.out.println("The given number is greater than 5);
			}

		// if - else -if
		
			if(num<5){
			 System.out.println("The given number is less than 5 ");
			}
			else if(num == 5){
				System.out.println("The given number is equal to 5");
			}
			else{
				System.out.println("The given number is greater than 5);
			}
		
		// switch-case
	}
}