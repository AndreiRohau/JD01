package by.pvt.asrohau.homework.linearPrograms.chapter_6.section_1.part_4;



//foreign


public class T2 {

	public static void main(String[] args) {

		int bull_qt;
		int cow_qt;
		int calf_qt;

		for (bull_qt = 0; bull_qt < 10; bull_qt++) {
			for (cow_qt = 0; cow_qt < 20; cow_qt++) {
				for (calf_qt = 0; calf_qt < 200; calf_qt++) {
					if (10 * bull_qt + 5 * cow_qt + 0.5 * calf_qt == 100 && bull_qt + cow_qt + calf_qt == 100) {
						System.out.println("На 100 рублей можно купить " + bull_qt + " быков, " + cow_qt + " коров, "
								+ calf_qt + " телят.");
						break;
					}
				}
			}
		}

	}

}