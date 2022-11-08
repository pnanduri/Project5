public class HolidayBonus {
	private final static int OTHERBONUS = 2000;
	private final static int HIGHESTBONUS = 5000;
	private final static int LOWESTBONUS = 1000;
	

	public static double[] calculateHolidayBonus(double[][] t) {
		double[][] BonusArr = new double[t.length][];
		for (int count = 0; count < t.length; count++) {
			BonusArr[count] = new double[t[count].length];
		}
		for (int count = 0; count < BonusArr.length; count++) {
			int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(t, count);
			int lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(t, count);
			for (int i = 0; i < BonusArr[count].length; i++) {
				if (count < BonusArr[i].length) {
					BonusArr[highestIndex][count] = HIGHESTBONUS;
					BonusArr[lowIndex][count] = LOWESTBONUS;
					if (i == highestIndex || i == lowIndex)
						continue;
					else
						BonusArr[i][count] = OTHERBONUS;
				}
			}
		}
		for (int count = 0; count < BonusArr.length; count++) {
			for (int i = 0; i < BonusArr[count].length; i++) {
				System.out.println(BonusArr[count][i]);
			}
		}
		double[] BonusPerStore = new double[t.length];
		for (int count = 0; count < BonusArr.length; count++) {
			for (int i = 0; i < BonusArr[count].length; i++) {
				BonusPerStore[count] += BonusArr[count][i];
			}
		}
		return BonusPerStore;
	}

	public static double calculateTotalHolidayBonus(double[][] t) {
		double[][] BonusArr = new double[t.length][];
		for (int count = 0; count < t.length; count++) {
			BonusArr[count] = new double[t[count].length];
		}
		for (int count = 0; count < BonusArr.length; count++) {
			int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(t, count);
			int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(t, count);
			for (int i = 0; i < BonusArr[count].length; i++) {
				if (count < BonusArr[i].length) {
					BonusArr[lowestIndex][count] = LOWESTBONUS;
					BonusArr[highestIndex][count] = HIGHESTBONUS;
				
					if (i == highestIndex || i == lowestIndex)
						continue;
					else {
						BonusArr[i][count] = OTHERBONUS;
					}
				}
			}

		}
		double holidayTotal = 0.0;
		for (int count = 0; count < BonusArr.length; count++) {
			for (int i = 0; i < BonusArr[count].length; i++) {
				holidayTotal += BonusArr[count][i];
			}
		}
		return holidayTotal;
	}
}
