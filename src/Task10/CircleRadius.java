package Task10;

public class CircleRadius {
	private Double pi;
	private Double radius;
	
	//No argument constructor
	CircleRadius(){
		pi=3.14;
		radius=6.0;
	}
	
	//Two argument constructor 
	CircleRadius(Double pai,Double radius){
		this.pi=pai;
		this.radius=radius;		
	}
	
	
	//Calculate the Circumstance
	private Double CalculateCircumstance(){
		return 2*pi*radius;
	}
	
	public static void main(String[] args) {
		
		// Create object for no argument constructor
		CircleRadius radiusObject=new CircleRadius();
		
		//Create object for two argument constructor
		CircleRadius radiusObjectTwo=new CircleRadius(3.14,4.0);
		Double circumstance=radiusObject.CalculateCircumstance();
		System.out.println("The Circumstance is "+circumstance);
		
		Double circumstanceTwo=radiusObjectTwo.CalculateCircumstance();
		System.out.println("The Circumstance is "+circumstanceTwo);
		
	}

}
