package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 7. Даны два действительных числа х и у.  
 * Вычислить их сумму, разность, произведение и частное. 
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {

		System.out.println("Set x & y:");
		double sum, difference, product, quotient, x, y; // change in code = vars for certain task
		int varsInTotal = 2; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		x = arr[0];
		y = arr[1];


		// counting part
		sum = x + y;
		difference = x - y;
		product = x * y;
		quotient = x / y;

		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("sum is " + sum);
		System.out.println("difference is " + difference);
		System.out.println("product is " + product);
		System.out.println("quotient is " + quotient);


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
