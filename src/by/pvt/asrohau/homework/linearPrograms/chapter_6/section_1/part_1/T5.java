package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		double y, e, x;
		// ScannerBlock
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter three nums"); // amount of nums

			double[] arrNums = new double[3]; // amount of nums
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
			y = arrNums[0];
			e = arrNums[1];
			x = arrNums[2];

		}

		// logical part
		double result;
		result = 3 + Math.pow(e, y - 1);

		result = result / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(x)));
		
		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
		} else {
			System.out.println("Error : / zero");
		}
		
	}

}
