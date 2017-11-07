package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_4;

import java.util.Scanner;


// foreign


public class T1 {

	public static void main(String[] args) {
		{

			int[] x = new int[4];
			int[] y = new int[4];

			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 4; ++i) {
				System.out.println("Введите (x" + i + ",y" + i + "): ");
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			sc.close();

			/*
			 * ���������, �� ����� ������� �� ����� ������������� ��������� �����
			 */
			int a = (x[1] - x[0]) * (y[2] - y[1]) - (x[2] - x[1]) * (y[1] - y[0]);
			int b = (x[2] - x[0]) * (y[3] - y[2]) - (x[3] - x[2]) * (y[2] - y[0]);
			int c = (x[3] - x[0]) * (y[1] - y[3]) - (x[1] - x[3]) * (y[3] - y[0]);

			if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
				System.out.println("Входит в треугольник");
			} else {
				System.out.println("не входит в треугольник");
			}

		}

	}

}