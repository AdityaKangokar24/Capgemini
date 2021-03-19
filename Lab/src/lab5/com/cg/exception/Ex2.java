package lab5.com.cg.exception;

import java.util.Scanner;

class EmployeeException extends Exception {
	public EmployeeException(String msg) {
		super(msg);
	}
}

public class Ex2 {
	public static void main(String[] args) throws EmployeeException {
		Scanner read = new Scanner(System.in);
		int salary = read.nextInt();
		if(salary<3000) {
			throw new EmployeeException("Invalid Salary");
		}
	}
}