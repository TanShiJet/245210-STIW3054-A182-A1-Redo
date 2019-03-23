import java.util.Scanner;

public class ActorPoints implements Runnable {
	
	int [] aplist= {0,0,0};
	int [] totalaplist= {0,0,0};
	double ap;
	
	public ActorPoints ( ) {
		
		this.aplist = aplist;
		this.ap = ap;
	}
	


	@Override
	public void run() {
		boolean done = false;
		Scanner option = new Scanner (System.in);
		ErrorCheck c1= new ErrorCheck();
		do {
			
			System.out.println("\n"+" Weighting Actors for Complexity ");
			System.out.println("******************************************************************************"+"\n" );
			System.out.println("-----------------------------------------------------------------------------");
			System.out.printf("|%4s|%15s |%40s |%10s |\n","No.","Actor type  ","Description               ","Qnty   ");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.printf("|%-4s|%-15s |%-40s |%-10d |\n","1.","Simple","Defind API", aplist[0]);
			System.out.printf("|%-4s|%-15s |%-40s |%-10d |\n","2.","Average","Interactive or Protocal driven interface", aplist[1]);
			System.out.printf("|%-4s|%-15s |%-40s |%-10d |\n","3.","Complex","Graphical User Interface ",aplist[2]);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("\n"+"******************************************************************************"+"\n" );
			System.out.println("1. Please enter numberof row you want to change the quantity"+"\n"+"2. insert \"d\" after you are done \n");
			System.out.print(">>");
			
			String ans = option.nextLine();
			
			switch (ans) {
			
			
					case "1":
					System.out.println("Please enter the quantity.");
					System.out.print(">>");
					aplist[0]= c1.Check1();
					totalaplist[0]= aplist[0] * 1;
					break;
				
				case "2":
					System.out.println("Please enter the quantity.");
					System.out.print(">>");
					aplist[1]= c1.Check1();
					//option.nextLine();
					totalaplist[1]= aplist[1] * 2;
					break;
					
				case "3":
					System.out.println("Please enter the quantity.");
					System.out.print(">>");
					aplist[2]= c1.Check1();
					//option.nextLine();
					totalaplist[2]= aplist[2] * 3;
					break;
					
				case "d":
					done = true;
					break;
				
					
				default :
					System.out.print("please try again"+"\n");
					break;
					
			}
						
		} while (done == false);
		
		for (int i : totalaplist)
		    ap += i;
		
		
		
	}
	
	public double getAP() {
		return ap;
	}
	
	
	
}
