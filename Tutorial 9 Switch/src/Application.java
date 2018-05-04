import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a command");
		String value = input.nextLine();
		
		switch(value){
	    case "start" :
	    System.out.println("machine started");
	    break;
	    
	    case "stop":
	    	System.out.println("machine stopped");
	    	break;
	    default:
	    	System.out.println("could not recognized");
	    	
	    
	    
		}
		
	}

}
