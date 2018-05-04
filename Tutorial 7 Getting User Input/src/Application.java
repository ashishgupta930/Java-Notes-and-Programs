import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		//Create Scanner Obbject
		Scanner input = new Scanner(System.in); 
		
		//output the prompt
	//	System.out.println("Enter String Value :");
		//System.out.println("Enter Integer Value");
		System.out.println("Enter Double Value");
		 
		//wait for the user to enter something
		//String value = input.nextLine();
		//int value = input.nextInt();
		double value = input.nextDouble();
		
		
		//Tell him what you entered
		System.out.println("You Entered is :" +value);
	}

}
