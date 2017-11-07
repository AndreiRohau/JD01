package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 *12. Треугольник задан величинами своих углов и радиусом описанной окружности. 
 *		Найти стороны треугольника.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T12 {
	public static void main(String[] args) {

		System.out.println("Set 3 angles and radius:");
		double x, y, z, a, b, c, r; // change in code = vars for certain task
		int varsInTotal = 4; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		a = arr[0];
		b = arr[1];
		c = arr[2];
		r = arr[3];

		// counting part
		
		x = 2 * r * Math.sin(a * Math.PI / 180);
		y = 2 * r * Math.sin(b * Math.PI / 180);
		z = 2 * r * Math.sin(c * Math.PI / 180);

		// wait while processing =D =D =D
		//processing(varsInTotal);
		System.out.println();
		System.out.println("Sides are \nx = " + x + " \ny = " + y + " \nz = " + z);

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
