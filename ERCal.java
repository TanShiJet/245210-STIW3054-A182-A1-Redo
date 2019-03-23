
public class ERCal implements Runnable{
	
	
	double er;
	double[] totaleflist;
	
	

	public ERCal (double [] totaleflist) {
		
		this.totaleflist = totaleflist;
	}

	@Override
	public void run() {
		
		
		if (totaleflist[0]<3) {
			er++;
		}
		if (totaleflist[1]<3) {
			er++;
		}
		if (totaleflist[2]<3) {
			er++;
		}
		if (totaleflist[3]<3) {
			er++;
		}
		if (totaleflist[4]<3) {
			er ++;
		}
		if (totaleflist[5]<3) {
			er ++;
		}
		if (totaleflist[6]>3) {
			er ++;
		}
		if (totaleflist[7]>3) {
			er ++;
		}
		
		if (er < 3)
			er = 20;
		
	    else if (er < 6)
			er = 28;
	    
	    else 
	    	er = 0;
		
	}
	
	public double getER() {
		return er;
	}

}
