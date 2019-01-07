import java.util.Scanner;

public class App {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		Employee employee = new Employee(name, salary, ID, dateOfHired);
		SystemDeveloper developer = new SystemDeveloper("Marcus", 0, 876544, 01/02/1982, 0, 0);
		SalesPerson sales = new SalesPerson("Magnus", 0, 876544, 01/02/1982, 0, 0);
		
		
		System.out.println("##   What do you want to do   ## ");
		System.out.println("select operation do you want ");
		System.out.println(" 1.  System Developer \n 2.  Sales Person");
		int function = sc.nextInt();
		
		switch(function) {
		
		case 1:
			System.out.println(" Hallo System Developer ");
			System.out.println("Pls Put The Number Of Certificate");
			developer.setCertificate(sc.nextInt());
			
			System.out.println("Pls Put The Number Of Programming Language");
			developer.setProgrammingLanguage(sc.nextInt());
	    	
	    	System.out.println(developer.toString());
			break;
			
		case 2:
			System.out.println(" Hallo Sales Person ");
			System.out.println("Pls Put The Number Of Managed Client");
			sales.setManagedClient(sc.nextInt());
			
			System.out.println("Pls Put The Number Of Aquired Cliente");
			sales.setAquiredClient(sc.nextInt());
	    	
	    	System.out.println(developer.toString());
			break;
		
		}
		
		
	}

}
