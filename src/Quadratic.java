
public class Quadratic {

	
	public double a;
	public double b;
	public double c;
	
	
	public Quadratic() {
		
		
	}
	
	public void setA(double a) {
		
		this.a = a;
		
		
	}
	public void setB(double b) {
		
		this.b = b;
		
		
	}
	public void setC(double c) {
		
		this.c = c;
		
		
	}
	
	
	
	public String getSolutions() {
		
		double disc = ((b*b)-(4*a*c));
		double sol1;
		double sol2;
		
		if(disc < 0) {
			
			return "no real solutions";
			
		}
	
		
		else if(disc==0) {
			sol1 = (((-b)+(Math.sqrt(disc)))/(2*a));
			return ("One Solution: " + Double.toString(sol1));
			
			
		} else {
			sol1 = (((-b)+(Math.sqrt(disc)))/(2*a));
			sol2 = (((-b)-(Math.sqrt(disc)))/(2*a));
			return ("Two Solutions: " + Double.toString(sol1) + " , " + Double.toString(sol2));
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
