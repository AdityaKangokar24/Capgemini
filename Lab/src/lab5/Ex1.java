package lab5;

import java.util.*;

	class InvalidAgeException extends Exception {
		public InvalidAgeException(String msg) {
			super(msg);
			
		}
	}
	public class Ex1 {
		public static void main(String[] args) throws InvalidAgeException {
			Scanner read = new Scanner(System.in);
			System.out.println("Enter an integer for age:");
			int age = read.nextInt();
			
			if(age<15) throw new InvalidAgeException("Age of person should be above 15");
		}
	}

