import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorCheck2 {
	
	int ans;
	
	public ErrorCheck2() {
		this.ans= ans;
	}
	
	public int Check2() {
		boolean a = true ;
		Scanner option = new Scanner (System.in);
		do {
			
			try {
				do {
				this.ans= option.nextInt();
				a = true ;
				
				if(ans >5 ||ans<0) {
					 System.out.println(" rate each factor from 0 to 5, pls try again");
					 option.nextLine();
					 System.out.print(">>");
				}
				
				} while (ans >5 ||ans<0);
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
