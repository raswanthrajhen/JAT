package Task10;

class Tea {
    public void prepare() {
        System.out.println("Preparing tea...");
    }
}

class BlackTeaPrepare extends Tea {

    public void prepare() {
        System.out.println("Preparing black tea...");
    }
}

class HerbalTeaPrepare extends Tea {

    public void prepare() {
        System.out.println("Preparing herbal tea...");
    }
}

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
