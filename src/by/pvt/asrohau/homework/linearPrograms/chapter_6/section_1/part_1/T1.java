package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {

		double result, a, b, c;

		// ScannerBlock - copypaste --- except : initialization
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter three nums"); // change amount of required nums
			double[] arrNums = new double[3]; // change amount of required nums
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
			a = arrNums[0];
			b = arrNums[1];
			c = arrNums[2];

		}

		// logical part

		result = b * b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);

		result = result / (2 * a);

		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}

	}
}
