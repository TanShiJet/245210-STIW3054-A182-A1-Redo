import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorCheck {
	
	int ans;
	
	public ErrorCheck() {
		this.ans= ans;
	}
	
	public int Check1() {
		boolean a = true ;
		Scanner option = new Scanner (System.in);
		do {
			
			try {
				this.ans= option.nextInt();
				a = true ;
			}
			 catch (InputMismatchException exception)
		    {
		        System.out.println("Integers only, please try again.");
		        a = false;
		        option.nextLine();
		        System.out.print(">>");
		    }
		}while ( a == false );
		
		return this.ans;
	}
}
