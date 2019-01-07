
public class SalesPerson extends Employee{
	
	
	private int managedClient;
	private int aquiredClient;
	
	public SalesPerson(String name, int selary, int ID, int dateOfHired, int managedClient, int aquiredClient) {
		super();
		this.managedClient = managedClient;
		this.aquiredClient = aquiredClient;
		this.salary = getSalary() + (500*getManagedClient() + (1000*getAquiredClient()));

	}
	
	


	public int getManagedClient() {
		return managedClient;
	}

	public void setManagedClient(int managedClient) {
		this.managedClient = managedClient;
	}

	public int getAquiredClient() {
		return aquiredClient;
	}

	public void setAquiredClient(int aquiredClient) {
		this.aquiredClient = aquiredClient;
	}
	
      private void calculatedSalery() {
		
		setSalary(getSalary()+ (500*getManagedClient() + (1000*getAquiredClient())));
		
	}

	@Override
	public String toString() {
		calculatedSalery();
		return "ID Number " + getID() + "\n Salery " + getSalary();
	}







	

	

}
