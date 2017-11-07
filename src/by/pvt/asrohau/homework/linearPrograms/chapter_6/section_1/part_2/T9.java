package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 9. Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, 
 * радиусы вписанной и описанной окружностей.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {

		System.out.println("Set leg:");
		double area, height, rInternal, rExternal, x; // change in code = vars for certain task
		int varsInTotal = 1; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		x = arr[0];

		// counting part

		double perimeter = x * 3, p = perimeter / 2;
		area = Math.sqrt(p * Math.pow(p - x, 3));
		height = (area * 2) / x;
		rInternal = x / (2 * Math.sqrt(3.0));
		rExternal = (2 * height) / 3;

		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("area is " + area);
		System.out.println("height is " + height);
		System.out.println("rInternal is " + rInternal);
		System.out.println("rExternal is " + rExternal);

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
