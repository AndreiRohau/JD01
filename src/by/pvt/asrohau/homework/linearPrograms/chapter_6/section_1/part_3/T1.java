package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_3;
/*1. Сумма двух первых цифр заданного четырехзначного числа 
 * равна сумме двух его последних цифр.
 * 
 */

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {

		int x; // change in code = vars for certain task
		int varsInTotal = 1; // change in code = for scanner total nums needed
		double[] arr = scanner(varsInTotal);
		checkArr(arr);

		// initializing
		x = (int) arr[0];

		// counting part	
		
		if ((x % 10 + (x % 100 - x % 10) / 10) == 
				(x % 1000 - x % 100) / 100 + (x % 10000 - x % 1000) / 1000) {
			
			System.out.println("True ");
		} else {
			System.out.println("False ");
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
}