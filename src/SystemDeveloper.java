
public class SystemDeveloper extends Employee{
	
	
	private int certificate;
	private int programmingLanguage;
	
	public SystemDeveloper(String name, int salary, int ID, int dateOfHired, int certificate, int programmingLanguage) {
		super(name,  ID,  dateOfHired);
		this.certificate = certificate;
		this.programmingLanguage = programmingLanguage;
		this.salary = getSalary()+ (1000*getCertificate() + (1500*getProgrammingLanguage()));
	}
	


	public int getCertificate() {
		return certificate;
	}

	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}

	public int getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(int programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public void calculatedSalery() {
		this.salary = getSalary() + (1000*getCertificate() + (1500*getProgrammingLanguage()));
		
	}
	
	@Override
	public String toString() {
		calculatedSalery();
		return "ID Number " + getID() + "\n Salery " + getSalary(); 
	}


	
	

}
