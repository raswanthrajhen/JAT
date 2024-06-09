package Task10;

public class TeaPreparation {

	private String basicTea;
	
	// Basic Tea
	private void prepareTea(){
		basicTea="Hotwater"+"AND Tealeaves";
		System.out.println("Basic Tea is Ready");
	}
	
	// Basic Tea with Milk
	private void addMilk() {
		basicTea=basicTea+"Add Milk";
		System.out.println(" Add Extra Milk");
	}
	
	// Basic Tea with Extra Sugar
	private void addSugar() {
		basicTea=basicTea+"Add sugar";
		System.out.println(" Add Extra Sugar");
	}
	public static void main(String[] args) {
		TeaPreparation teaObject=new TeaPreparation();
		
		// call prepare Tea Method
		teaObject.prepareTea();
		
		// call add Milk Method
		teaObject.addMilk();
		
		//call add sugar method
		teaObject.addSugar();
		

	}

}
