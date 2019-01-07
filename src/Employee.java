
public class Employee {
	
	
	private String name;
	protected int salary = 25000;
	private int ID;
	private int dateOfHired;
	
	


	public Employee(String name,  int ID, int dateOfHired) {
		super();
		this.name = name;
		
		this.ID = ID;
		this.dateOfHired = dateOfHired;
	}
	
	
	public Employee(){
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getDateOfHired() {
		return dateOfHired;
	}


	public void setDateOfHired(int dateOfHired) {
		this.dateOfHired = dateOfHired;
	}
	
}
