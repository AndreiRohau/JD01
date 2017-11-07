package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_1;

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {

		double result, x;
		
		int varsInTotal = 1; //for scanner total nums needed
		// ScannerBlock - copypaste --- except : initialization
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter " + varsInTotal + " num"); 
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
			
		}

		// logical part

		result = Math.log(Math.abs(Math.cos(x)));

		result = result / (Math.log(1 + Math.pow(x,  2)));

		if (!Double.isNaN(result) && Double.isFinite(result)) {
			System.out.println("Result = " + result);
		} else {
			System.out.println("Error : / zero or NaN or Infinity ");
		}

	}
}
