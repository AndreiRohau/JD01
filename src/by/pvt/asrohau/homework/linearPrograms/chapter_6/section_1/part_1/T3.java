package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		double x;
		double y;
		
		// ScannerBlock
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter two nums"); // amount of nums

			double[] arrNums = new double[2]; // amount of nums
			int counterNums = 0;

			while (counterNums < arrNums.length) {

				if (sc.hasNextDouble()) {
					arrNums[counterNums] = sc.nextDouble();
					counterNums++;
					System.out.println(counterNums + " number was saved");

				} else {
					sc.next();
					System.out.println("Please use numbers!");

				}
			}
			sc.close();
			System.out.println("");
			System.out.println("Your numbers are: ");
			for (int i = 0; i < arrNums.length; i++) {
				System.out.println((i + 1) + " number is : " + arrNums[i]);
			}
			System.out.println("");

			// initializing
			x = arrNums[0];
			y = arrNums[1];

		}
		
		double result;
		
		result = (Math.sin(x) + Math.cos(y)) * Math.tan(x * y);
		
		result = result / (Math.cos(x) - Math.sin(y));
		
		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}
		
	}

}
