

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		double [] eflist = {0,0,0,0,0,0,0,0};
		
		
		
		double AP = 0;  //ActorPoint
		double UC = 0; //Use Case
		double UUCP = 0; //Unadjusted Use Case Point
		double TF = 0; //Technical factor
		double TCF = 0; // Technical Complexity Factor
		double SzUC = 0; // Size of the software (use case)
		double EF = 0; // Experience Factors 
		double UCP = 0; // Use case point 
		double MH = 0; // Man-hour (calculate using ucp)
		double ER = 0; //Effort Rate
		
		ActorPoints ap1 = new ActorPoints();
		Thread t1 = new Thread(ap1);
		UseCase uc1 = new UseCase();
		Thread t2 = new Thread(uc1);
		TechnicalFactor tf1 = new TechnicalFactor();
		Thread t3 = new Thread(tf1);
		ExperienceFactors ef1 = new ExperienceFactors();
		Thread t4 = new Thread(ef1);
		
		
		t1.start();
		
			try {
				t1.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		
		t2.start();
		
			try {
				t2.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		
		t3.start();
		
			try {
				t3.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		
		t4.start();
		
			try {
				t4.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		eflist = ef1.getEFlist();
			
		ERCal er1 = new ERCal(eflist);
		Thread t5 = new Thread(er1);
		
		t5.start();
		
		try {
			t5.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(er1.getER());
		
		//Calculate software effort 
		AP = ap1.getAP();
		UC = uc1.getUC();
		TF = tf1.getTF();
		EF = ef1.getEF(); 
		ER = er1.getER();
		UUCP = AP + UC;
		TCF = (0.01 * TF) + 0.6 ;
		SzUC = UUCP * TCF;
		EF = (-0.03 *EF) + 1.4 ;
		UCP = SzUC * EF ;
		MH = ER * UCP; 
		
		//display result
		System.out.println("Result**************************************************************" );
		System.out.printf("%35s : %.2f \n","Unadjusted Use Case Point", UUCP);
		System.out.printf("%35s : %.2f \n","Technical Complexity Factor", TCF);
		System.out.printf("%35s : %.2f \n","Size of the software", SzUC);
		System.out.printf("%35s : %.2f \n","Experience Factors ", EF);
		System.out.printf("%35s : %.2f \n","Use case point ",UCP);
		if (ER ==0)
			System.out.println("\n* this project is at significant risk of failure with this team.");
		else
			System.out.printf("%35s : %.2f \n","Man-hour ", MH );
	}

}
