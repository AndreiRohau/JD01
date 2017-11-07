package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {

		double result, x, y;
		int varsInTotal = 2; // for scanner total nums needed
		// ScannerBlock - copypaste --- except : initialization
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter " + varsInTotal + " nums");
			double[] arrNums = new double[varsInTotal];
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

		// logical part

		result = Math.pow(1 - Math.tan(x), 1.0 / Math.tan(x));

		result = result + Math.cos(x + y);

		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}

	}
}
