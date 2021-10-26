package Day5;

public class Employee {
	// Encapsulation - 
	// bind data members with methods 
	// to secure data 
	// make fields as private 
	// make public methods to access those fields 


	private int eid;
	private String firstName;
	private double salary = 8000; // read-only + writable field

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

