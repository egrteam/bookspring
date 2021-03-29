package clinica;

public class Employee extends Person {
	
	//fields-------------------------------------------------------------------------------
	protected double salaryEmployee;

	
	//constructors-----------------------------------------------------------------------------------
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int day, int month, int year,  double basicSalary, double salaryEmployee) {
		super(name, day, month, year, basicSalary);
		this.salaryEmployee = salaryEmployee;
	}
	
	//to-do
	/*
	 * public Employee(String name, double basicSalary, double salaryEmployee) {
	 * super(name, basicSalary); this.salaryEmployee = salaryEmployee; }
	 */

	public Employee(String name, int height, int weigth) {
		super(name, height, weigth);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//methods------------------------------------------------------------------------------------------------
	@Override
	public double getSalary() {
		return salaryEmployee + basicSalary;
	}
	
	//getters and setters----------------------------------------------------------------------------------
	public double getSalaryEmployee() {
		return salaryEmployee;
	}

	public void setSalary(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}

	//toString--------------------------------------------------------------
	@Override
	public String toString() {
		return "Employee [salary=" + this.getSalary() + " salaryEmployee: " + salaryEmployee + " basicSalary: " + basicSalary + "]"
				+ "\n " +  super.toString();
	}
	
	
	
}
