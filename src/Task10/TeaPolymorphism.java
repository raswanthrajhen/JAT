package Task10;

//Polymorphism
class Tea {
    public void prepare() {
        System.out.println("Preparing tea...");
    }
}

//Extend the parent class child class
class BlackTeaPrepare extends Tea {

    public void prepare() {
        System.out.println("Preparing black tea...");
    }
}

//Extend the parent class child class
class HerbalTeaPrepare extends Tea {

    public void prepare() {
        System.out.println("Preparing herbal tea...");
    }
}

//Extend the parent class child class
class GreenTeaPrepare extends Tea {
    public void prepare() {
        System.out.println("Preparing green tea...");
    }
}
public class TeaPolymorphism {
	
	
	
	public static void main(String[] args) {
        Tea myTea;

        myTea = new BlackTeaPrepare();
        myTea.prepare(); 
        
        myTea = new HerbalTeaPrepare();
        myTea.prepare();

        myTea = new GreenTeaPrepare();
        myTea.prepare(); 

      
	}
       
}
