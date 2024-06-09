package Task10;

public class PersonConstructor {
	    private String name;
	    private Integer age;
	    
	    // Constructor
	    PersonConstructor( String name , Integer age)
	    {
	    	this.name=name;
	    	this.age=age;
	    }
	
	    //Get Method
		public Integer getAge() {
			return age;
		}

		public String getName() {
			return name;
		}
		
	public static void main(String[] args) {
		PersonConstructor object=new PersonConstructor("Raswanth", 28);
	
		//get the Name and Age by using Get Method
		String getName=object.getName();
		Integer getAge=object.getAge();
		
		System.out.print("The name from the class "+getName);
		System.out.print("The name from the class "+getAge);
	}

}
