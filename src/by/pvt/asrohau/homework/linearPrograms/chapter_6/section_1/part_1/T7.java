package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {

		double result, y, x;
		
		int varsInTotal = 2; //for scanner total nums needed
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
			y = arrNums[0];
			x = arrNums[1];
			
		}

		// logical part

		result = y - Math.sqrt(Math.abs(x));
		result = result * (x - (y / ( x + Math.pow(x / 2, 2))));
		result = Math.log(Math.abs(result));

		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
			System.out.println();			
		}

	}
}
