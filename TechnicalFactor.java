import java.util.Scanner;

public class TechnicalFactor implements Runnable{
	
	int [] tflist= {0,0,0,0,0,0,0,0,0,0,0,0,0};
	double [] totaltflist = {0,0,0,0,0,0,0,0,0,0,0,0,0};
	double tf;

	public  TechnicalFactor() {
		this.tflist = tflist;
		this.tf = tf;
	}

	@Override
	public void run() {
		Scanner option = new Scanner (System.in);
		boolean done = false;
		ErrorCheck2 c1= new ErrorCheck2();
		do {
		
				System.out.println("\n"+" Weighting Technical Factors  ");
				System.out.println("***************************************************************************"+"\n" );
				System.out.println("---------------------------------------------------------------------------");
				System.out.printf("|%4s|%50s |%10s |\n","No.","Factor Description                "," Project Rating");
				System.out.println("----------------------------------------------------------------------------");
				System.out.printf("|%-4s|%-50s |%-15d |\n","1.","Must have a distributed solution",tflist[0]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","2.","Must respond tospecific performance objectives",tflist[1]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","3.","Must meet end-user efficieny desires",tflist[2]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","4.","Complex internal processing",tflist[3]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","5.","Code must be reuseable",tflist[4]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","6.","Must be easy to install",tflist[5]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","7.","Musr be easy to use",tflist[6]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","8.","Must be portable",tflist[7]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","9.","Must be easy to change ",tflist[8]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","10.","Must allow concurrent users",tflist[9]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","11.","Includes special security features",tflist[10]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","12.","Must provide direct access for #rd parties",tflist[11]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","13.","Requires special user training facilities",tflist[12]);
				System.out.println("---------------------------------------------------------------------------");
				
				System.out.println("\n"+"***************************************************************************"+"\n" );
				System.out.println("1. Please enter numberof row you want to change the Project Rating"+"\n"+"2. rate each factor from 0 to 5. A rating of 0 means the factor is \n   irrelevant for this project, 5 means it is essential \n"+"3. insert \"d\" after you are done. ");
				System.out.print("\n>>");
				
				String ans = option.nextLine();
				

				switch (ans){
					case "1":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[0]=c1.Check2();
						//option.nextLine();	
						totaltflist [0] = tflist[0] * 2;
						break;
					
					case "2":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[1]=c1.Check2();
						//option.nextLine();	
						totaltflist [1]= tflist[1]* 1;
						break;
						
					case "3":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[2]=c1.Check2();
						//option.nextLine();	
						totaltflist [2]= tflist[2]* 1;
						break;
						
					case "4":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[3]=c1.Check2();
						//option.nextLine();	
						totaltflist [3]= tflist[3] * 1;
						break;
						
					case "5":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[4]=c1.Check2();;
						//option.nextLine();	
						totaltflist [4]= tflist[4] * 1;
						break;
						
					case "6":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[5]=c1.Check2();
						//option.nextLine();	
						totaltflist [5]= tflist[5] * 0.5;
						break;
						
					case "7":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[6]=c1.Check2();
						//option.nextLine();	
						totaltflist [6] = tflist[6] * 0.5;
						break;
						
					case "8":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[7]=c1.Check2();
						//option.nextLine();	
						totaltflist [7]= tflist[7]* 2;
						break;
						
					case "9":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[8]=c1.Check2();
						//option.nextLine();	
						totaltflist [8] = tflist[8] * 1;
						break;
						
					case "10":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[9]=c1.Check2();
						//option.nextLine();	
						totaltflist [9] = tflist[9] * 1;
						break;
					
					case "11":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[10]=c1.Check2();
						//option.nextLine();	
						totaltflist [10] = tflist[10] * 1;
						break;
						
					case "12":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[11]=c1.Check2();
						//option.nextLine();	
						totaltflist [11] = tflist[11]* 1;
						break;
						
					case "13":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						tflist[12]=c1.Check2();
						//option.nextLine();	
						totaltflist [12]= tflist[12] * 1;
						break;
						
					case "d":
						done = true;
						break;
					
							
					default :
						System.out.print("please try again"+"\n");
						break;
						
				}				
				
		
		}while (done == false);
		
		for (double i : totaltflist)
		    tf += i;
		
		
		
	}
	
	public double getTF() {
		return tf;
	}
	
	
}
