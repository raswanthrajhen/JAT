package Task10;

class BlackTea implements PreparationTea{
	//BlackTea with override method prepare tea
	private String basicTea;
	
	
	@Override
	public void prepareTea() {
		
	    basicTea=basicTea+"tea leaves";
		System.out.println("BlackTea is Ready");
		
	}
	
}

class GreenTea implements PreparationTea{
	private String basicTea;
	
	//GreenTea with override method prepare tea
	
	@Override
	public void prepareTea() {
		setBasicTea("Hotwater"+"Green tea leaves"+"sugar");
		System.out.println("GreenTea is Ready");	
	}
	public String getBasicTea() {
		return basicTea;
	}
	public void setBasicTea(String basicTea) {
		this.basicTea = basicTea;
	}
	
}


class HarbelTea implements PreparationTea{
	
	//HarbelTea with override method prepare tea
	
	private String basicTea;
	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		setBasicTea("Hotwater"+"Herbel leaves"+"sugar");
		System.out.println("HerbelTea is Ready");
		
	}
	public String getBasicTea() {
		return basicTea;
	}
	public void setBasicTea(String basicTea) {
		this.basicTea = basicTea;
	}
	
}


public class TeaTypes {

	public static void main(String[] args) {
		
		//BlackTea class object is created
		BlackTea blackTeaobject=new BlackTea();
		blackTeaobject.prepareTea();
		
		//GreenTea class object is created
		GreenTea greenTeaobject=new GreenTea();
		greenTeaobject.prepareTea();
		
		//HarbelTea class object is created
		HarbelTea harbelTeaObject=new HarbelTea();
		harbelTeaObject.prepareTea();
	}

}
