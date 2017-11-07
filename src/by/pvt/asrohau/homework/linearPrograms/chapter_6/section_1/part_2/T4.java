package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 4. Найти произведение цифр заданного четырехзначного числа.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {

		System.out.println("Set 4 digits number:");
		int multiple = 1, num; // change in code = vars for certain task
		int varsInTotal = 1; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		num = (int) arr[0];

		// counting part
		for(int i = 0; i < 4; i++ ) {
			multiple = multiple * (num % 10);
			num /= 10;
		}

		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("The multiple of digits is ");
		// Multiple - result
		if (!Double.isNaN(multiple) && Double.isFinite(multiple)) {
			System.out.println("Multiple = " + multiple);
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
