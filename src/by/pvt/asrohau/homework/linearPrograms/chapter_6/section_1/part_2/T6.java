package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 6. Вычислить расстояние между двумя точками с данными координатами (x1, y1) и (x2, y2). 
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T6 {
	public static void main(String[] args) {

		System.out.println("Set the coordinates (x1, y1), (х2, y2):");
		double length, x1, y1, x2, y2; // change in code = vars for certain task
		int varsInTotal = 4; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		x1 = arr[0];
		y1 = arr[1];
		x2 = arr[2];
		y2 = arr[3];

		// counting part
		// the length between to dots
		length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("The length between to dots is ");
		// Area
		if (!Double.isNaN(length) && Double.isFinite(length)) {
			System.out.println("length = " + length);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}

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
