package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 *14. Вычислить корни квадратного уравнения ax2 + bx + с = 0 с 
 *заданными коэффициентами а, b и с 
 *(предполагается, что а ≠ 0 и что дискриминант уравнения неотрицателен).
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T14 {
	public static void main(String[] args) {

		System.out.println("Set a, b, c ( a != 0 ):");
		double x1, x2, a, b, c, d; // change in code = vars for certain task
		int varsInTotal = 3; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		a = arr[0];
		b = arr[1];
		c = arr[2];

		// counting part
		d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			System.out.println("Discrimenant is negative!!!");
		} else {
			x1 = -b + Math.sqrt(d) / 2 * a;
			x2 = -b - Math.sqrt(d) / 2 * a;
			System.out.println();
			System.out.println("x1 is " + x1);
			System.out.println("x2 is " + x2);
		}
		
		

		// wait while processing =D =D =D
		// processing(varsInTotal);


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
