package by.pvt.asrohau.homework.linearPrograms;

/*
 * START AT http://kufas.ru/programming179.htm
 * 
 * 6.1.1 = 28 / 28 = all done
 * 6.1.2 = 14 / 44
 * 6.1.3 = 3 / 37
 * 6.1.4 = 2 / 40
 * 6.2.1.A = 
 * 6.2.1.B = 
 * 6.2.1.C = 
 * 
 * 
 * i'm at
 * 
 */
public class LinkForHomeWork {
	public static void main(String[] args) {

		tasks61();

	}

	private static void tasks61() {
		final int t611 = 28;
		final int t611D = 28; // done

		final int t612 = 44;
		final int t612D = 14; // TODO change 6.1.2

		final int t613 = 37;
		final int t613D = 3; // TODO change 6.1.3

		final int t614 = 40;
		final int t614D = 2; // TODO change 6.1.4

		final int tasks61sum = t611 + t612 + t613 + t614;
		final int tasks61Dsum = t611D + t612D + t613D + t614D;

		System.out.println("6.1   Done / Total : \n\t" + tasks61Dsum + " / " + tasks61sum);
		System.out.println("      left\n\t" + (tasks61sum - tasks61Dsum));
	}

}
