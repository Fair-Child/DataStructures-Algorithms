package SingleLinkedList;

public class EmployeeNodes {

	private Employee employee;
	private EmployeeNodes next;
	
	public EmployeeNodes(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public EmployeeNodes getNext() {
		return next;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setNext(EmployeeNodes next) {
		this.next = next;
	}
	
	public String toString() {
		return employee.toString();
	}
	
}
