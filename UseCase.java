import java.util.Scanner;

public class UseCase implements Runnable {
	
	int [] uclist= {0,0,0};;
	int [] totaluclist = {0,0,0};
	double uc;


	public UseCase() {
		
		this.uclist = uclist;
		this.uc = uc;
	}


	@Override
	public void run() {
		Scanner option = new Scanner (System.in);
		boolean done = false;
		ErrorCheck c1= new ErrorCheck();
		do {
				
				System.out.println("\n"+" Weighting Use Cases for Complexity  ");
				System.out.println("******************************************************************************"+"\n" );
				System.out.println("-----------------------------------------------------------------------------");
				System.out.printf("|%4s|%15s |%40s |%10s |\n","No.","Actor type  ","Description               ","Qnty   ");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.printf("|%-4s|%-15s |%-40s |%-10d |\n","1.","Simple","3 or fewer transactions",uclist[0]);
				System.out.printf("|%-4s|%-15s |%-40s |%-10d |\n","2.","Average","4 to 7 transactions",uclist[1]);
				System.out.printf("|%-4s|%-15s |%-40s |%-10d |\n","3.","Complex","Greater than 7 transactions ",uclist[2]);
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("\n"+"******************************************************************************"+"\n" );
				System.out.println("1. Please enter numberof row you want to change the quantity"+"\n"+"2. insert \"d\" after you are done.\n");
				System.out.print(">>");
				
				String ans = option.nextLine();					
				
				switch (ans){
					case "1":
						System.out.println("Please enter the quantity.");
						System.out.print(">>");
						uclist[0] = c1.Check1();
						//option.nextLine();	
						totaluclist [0] = uclist[0] * 5;
						break;
					
					case "2":
						System.out.println("Please enter the quantity.");
						System.out.print(">>");
						uclist[1] = c1.Check1();
						//option.nextLine();	
						totaluclist [1] = uclist[1] * 10;
						break;
						
					case "3":
						System.out.println("Please enter the quantity.");
						System.out.print(">>");
						uclist[2] = c1.Check1();
						//option.nextLine();	
						totaluclist [2] = uclist[2] * 15;
						break;
						
					case "d":
						done = true;

						break;
						
						
					default :
						System.out.print("please try again"+"\n");
						break;
						
				}				
				
		} while (done == false);
		
		for (int i : totaluclist)
		    uc += i;
		
		
		
	}
	
	public double getUC() {
		return uc;
	
	}
	


}
