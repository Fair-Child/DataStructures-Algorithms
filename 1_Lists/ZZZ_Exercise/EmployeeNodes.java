package ZZZ_Exercise;

public class EmployeeNodes {

	private Employee employee;
	private EmployeeNodes next;
	private EmployeeNodes previous;
	
	public EmployeeNodes(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public EmployeeNodes getNext() {
		return next;
	}
	
	public EmployeeNodes getPrevious() {
		return previous;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setNext(EmployeeNodes next) {
		this.next = next;
	}
	
	public void setPrevious(EmployeeNodes previous) {
		this.previous = previous;
	}
	
	public String toString() {
		return employee.toString();
	}

	
	
}
