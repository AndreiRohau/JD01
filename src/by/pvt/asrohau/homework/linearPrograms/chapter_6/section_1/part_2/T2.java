package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 2. Заданы координаты трех вершин треугольника (x1, y1), (х2, y2), (x3, y3). 
 * Найти его периметр и площадь.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {

		System.out.println("Set the coordinates (x1, y1), (х2, y2), (x3, y3):");
		double perimeter, area, x1, y1, x2, y2, x3, y3; // change in code = vars for certain task
		int varsInTotal = 6; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		x1 = arr[0];
		y1 = arr[1];
		x2 = arr[2];
		y2 = arr[3];
		x3 = arr[4];
		y3 = arr[5];

		// counting part
		double leg1, leg2, leg3;
		// the length between to dots
		leg1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		leg2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		leg3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

		perimeter = leg1 + leg2 + leg3;

		// use the Heron's formula to count the area.
		// S = sqrt(p * (p - a) * (p - b) * (p - c); where p = perimeter / 2; a, b, c are sides
		double p = perimeter / 2; // half of the perimeter
		
		area = Math.sqrt(p * (p - leg1) * (p - leg2) * (p - leg3));

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
