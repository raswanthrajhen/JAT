package Task10;

public class EmployeeDetails {
	Integer id, salary;
	String firstName,lastName;
	
	// Employee Details Constructor 
	EmployeeDetails(Integer id, String firstName,String lastName,Integer salary){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public Integer getId() {
		return id;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	// Annual Salary Calculation
	public Integer getAnnualSalary() {
		return salary*12;
	}
	
	//Salary Increment
	public Integer raiseSalary(Integer percentage) {
		Integer newSalary=(salary*percentage/100);
		return newSalary;
	}
	 @Override
		public String toString() {
			return "EmployeeDetails [id=" + id + ", salary=" + salary + ", firstName=" + firstName + ", lastName="
					+ lastName + "]";
		}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails empObject=new EmployeeDetails(101,"Raswanth","rajhen",10000);
		Integer empId=empObject.getId();
		String fName=empObject.getFirstName();
		String lName=empObject.getLastName();
		Integer oldSalary=empObject.getSalary();
		System.out.println(empId+""+fName+""+lName+""+oldSalary);
		Integer incrementSalary=empObject.raiseSalary(20);
		System.out.println("Increment salary is "+incrementSalary);
		Integer annualSalary=empObject.getAnnualSalary();
		System.out.println("Annual salary is "+annualSalary);
		
	}

}
