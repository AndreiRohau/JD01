package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_2;

/**
 * 5. Даны два числа. 
 * Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 * @author rohau.andrei
 */

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {

		System.out.println("Set 2 numbers:");
		double arithmeticMean, geometricMean, n1, n2; // change in code = vars for certain task
		int varsInTotal = 2; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		n1 =  arr[0];
		n2 =  arr[1];

		// counting part
		arithmeticMean = (Math.pow(n1, 3) + Math.pow(n2, 3)) / 2;
		
//		geometricMean = Math.pow(Math.abs(n1) * Math.abs(n2), 0.5);
		geometricMean = Math.sqrt(Math.abs(n1) * Math.abs(n2));


		// wait while processing =D =D =D
		processing(varsInTotal);

		System.out.println("The arithmetic Mean of digits is ");
		// arithmeticMean - result
		if (!Double.isNaN(arithmeticMean) && Double.isFinite(arithmeticMean)) {
			System.out.println("arithmetic Mean = " + arithmeticMean);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}
		System.out.println();
		System.out.println("The geometric Mean of digits is ");
		// arithmeticMean - result
		if (!Double.isNaN(geometricMean) && Double.isFinite(geometricMean)) {
			System.out.println("geometric Mean = " + geometricMean);
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
