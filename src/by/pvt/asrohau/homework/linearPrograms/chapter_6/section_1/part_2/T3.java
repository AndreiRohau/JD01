package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 3. Вычислить длину окружности и площадь круга 
 * одного и того же заданного радиуса R.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {

		System.out.println("Set radius:");
		double perimeter, area, r; // change in code = vars for certain task
		int varsInTotal = 1; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		r = arr[0];

		// counting part
		perimeter = 2 * Math.PI * r;
		
		area = Math.PI * Math.pow(r, 2);

		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("The perimeter of triangle is ");
		// Area
		if (!Double.isNaN(perimeter) && Double.isFinite(perimeter)) {
			System.out.println("Perimeter = " + perimeter);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}

		System.out.println();
		System.out.println("The area of triangle is ");
		// Area
		if (!Double.isNaN(area) && Double.isFinite(area)) {
			System.out.println("Area = " + area);
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
