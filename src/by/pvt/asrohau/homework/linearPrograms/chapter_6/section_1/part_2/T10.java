package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 *10. Известна длина окружности. 
 *		Найти площадь круга, ограниченного этой окружностью.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T10 {
	public static void main(String[] args) {

		System.out.println("Set perimeter of circle:");
		double area, x; // change in code = vars for certain task
		int varsInTotal = 1; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		x = arr[0];

		// counting part

		area = Math.pow(x, 2) / (4 * Math.PI);

		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("area is " + area);

	}
	// end of main method

	public static double[] scanner(int varsInTotal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + varsInTotal + " number(s)");
		double[] arrNums = new double[varsInTotal];

		for (int i = 0; i < arrNums.length;) {
			if (sc.hasNextDouble()) {
				arrNums[i] = sc.nextDouble();
				i++;
				System.out.println(i + " saved");
			} else {
				sc.next();
				System.out.println("Please use numbers!");
			}
		}
		sc.close();
		return arrNums;
	}

	public static void checkArr(double[] arrNums) {
		System.out.println("");
		System.out.println("@testPart \nYour numbers are: ");
		for (int i = 0; i < arrNums.length; i++) {
			System.out.println((i + 1) + " number is : " + arrNums[i]);
		}
		System.out.println("");
	}

	public static void processing(int varsInTotal) {
		for (; varsInTotal != 0; varsInTotal--) {
			System.out.println("Wait while processing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
