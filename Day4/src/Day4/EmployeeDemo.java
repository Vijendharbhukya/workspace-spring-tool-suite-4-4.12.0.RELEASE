package Day4;
 class company {

	int eid;
	String name;
	double salary;

	public company() {
		System.out.println("zero-args constructor");

	}

	public company(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor");
	}

}

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
		System.out.println(emp.eid + " " + emp.name + " " + emp.salary);

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);

		company emp3 = new company(103, "Sonu", 12.75);
		System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
	}


	

	}


