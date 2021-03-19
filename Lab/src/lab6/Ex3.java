package lab6;

import java.util.*;

public class Ex3 {

	public static Map<Integer, Integer> getSquares(int[] arr) {

		Map<Integer, Integer> squares = new HashMap<>();

		for (int i : arr) {
			squares.put(i, i * i);
		}

		return squares;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Enter arr size:");
		int size = read.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d integers:%n", size);
		for (int i = 0; i < size; i++) {
			arr[i] = read.nextInt();
		}

		Map<Integer, Integer> squares = getSquares(arr);

		System.out.println("Computed squares for each integer:");
		System.out.printf("%-10s\t%10s%n", "Integer", "Square");

		for (Map.Entry<Integer, Integer> entries : squares.entrySet()) {
			System.out.printf("%-10s\t%-10s%n", entries.getKey().toString(), entries.getValue().toString());
		}

	}

}