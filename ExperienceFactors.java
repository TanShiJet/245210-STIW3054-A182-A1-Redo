import java.util.Scanner;


public class ExperienceFactors implements Runnable {
	
	int [] eflist = {0,0,0,0,0,0,0,0};
	double [] totaleflist = {0,0,0,0,0,0,0,0};
	double ef;
	
	public ExperienceFactors() {
		this.eflist=eflist ;
		this.ef=ef;
	}
	@Override
	public void run() {
		Scanner option = new Scanner (System.in);
		boolean done = false;
		ErrorCheck2 c1= new ErrorCheck2();
		do {
		
				System.out.println("\n"+" Weighting Experience Factors  ");
				System.out.println("***************************************************************************"+"\n" );
				System.out.println("---------------------------------------------------------------------------");
				System.out.printf("|%4s|%50s |%10s |\n","No.","Factor Description                "," Project Rating");
				System.out.println("----------------------------------------------------------------------------");
				System.out.printf("|%-4s|%-50s |%-15d |\n","1.","Familiar with FPT software process",eflist[0]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","2.","Application experiance",eflist[1]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","3.","Paradigm expirience (OO)",eflist[2]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","4.","Lead analyst capability",eflist[3]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","5.","Motivation",eflist[4]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","6.","Stable Requirements",eflist[5]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","7.","Part-time workers",eflist[6]);
				System.out.printf("|%-4s|%-50s |%-15d |\n","8.","Difficulty of Programing language",eflist[7]);
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\n"+"***************************************************************************"+"\n" );
				System.out.println("1. Please enter numberof row you want to change the Project Rating"+"\n"+"2. rate each factor from 0 to 5. A rating of 0 means the factor is \n   irrelevant for this project, 5 means it is essential \n"+"3. insert \"d\" after you are done. ");
				System.out.print("\n>>");
				
				String ans = option.nextLine();
				
				switch (ans){
					case "1":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[0]=c1.Check2();
						//option.nextLine();
						totaleflist[0] = eflist[0]* 1; 
						break;
					
					case "2":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[1]=c1.Check2();
						//option.nextLine();
						totaleflist[1]  = eflist[1] * 0.5;
						break;
						
					case "3":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[2]=c1.Check2();
						//option.nextLine();
						totaleflist[2]  = eflist[2] * 1;
						break;
						
					case "4":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[3]=c1.Check2();
						//option.nextLine();
						totaleflist[3] = eflist[3] * 0.5;
						break;
						
					case "5":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[4]=c1.Check2();
						//option.nextLine();
						totaleflist[4]  = eflist[4] * 0;
						break;
						
					case "6":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[5]=c1.Check2();
						//option.nextLine();
						totaleflist[5]  = eflist[5]* 2;
						break;
						
					case "7":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[6]=c1.Check2();
						//option.nextLine();
						totaleflist[6] = eflist[6] * (-1);
						break;
						
					case "8":
						System.out.println("Please enter Project Rating.");
						System.out.print(">>");
						eflist[7]=c1.Check2();
						//option.nextLine();
						totaleflist[7] = eflist[7] * (-1);
						break;
						
					case "d":
						done = true;
						break;
						
							
					default :
						System.out.print("please try again"+"\n");
						break;
					
				}				
			
	
		}while (done == false);
		
		for (double i : totaleflist)
		    ef += i;
		
		
		
	}
		public double[] getEFlist() {
			
			return totaleflist;
			
		}
		public double getEF() {
			
			return ef;
		}
		
		
	
}
