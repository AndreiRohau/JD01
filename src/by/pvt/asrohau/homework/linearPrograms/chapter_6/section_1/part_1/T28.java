package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T28 {
	public static void main(String[] args) {

		double result, a, b, c, d, f, x, y, z; // change in code = vars for certain task
		int varsInTotal = 8; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		a = arr[0];
		b = arr[1];
		c = arr[2];
		d = arr[3];
		f = arr[4];
		x = arr[5];
		y = arr[6];
		z = arr[7];

		// counting part
		result = Math.pow(Math.cos(x), 2);

		result = result / Math.sin(x);
		
		result = result - x * y * z;

		result = result + (a * Math.pow(x, 2) + b * x + c) / (d * Math.pow(x, 3) - f);

		// wait while processing =D =D =D
		processing(varsInTotal);

		// result part
		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
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
