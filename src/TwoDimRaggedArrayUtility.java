import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file) {
		double[][] raggedArr = new double[6][];
		String l;
		int count = 0;
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				l = scan.nextLine();
				String[] t = l.split(" ");
				raggedArr[count] = new double[t.length];
				for (int i = 0; i < t.length; i++) {
					raggedArr[count][i] = Double.parseDouble(t[i]);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		return raggedArr;
	}

	public static void writeToFile(double[][] t, File outputFile) {
		try {
			FileWriter file = new FileWriter(outputFile);
			for (int count = 0; count < t.length; count++) {
				for (int i = 0; i < t[count].length; i++) {
					file.write(t[count] + " ");
				}
				file.write("\n");
			}
			file.close();
		} catch (Exception e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}

	public static double getTotal(double[][] t) {
		double total = 0;
		for (int count = 0; count < t.length; count++) {
			for (int i = 0; i < t[count].length; i++) {
				total += t[count][i];
			}
		}
		return total;
	}

	public static double getAverage(double[][] t) {
		double total = 0;
		int num = 0;
		for (int count = 0; count < t.length; count++) {
			for (int i = 0; i < t[count].length; i++) {
				total += t[count][i];
				num++;
			}
		}
		return (total / num);
	}

	public static double getRowTotal(double[][] t, int rowIndex) {
		double total = 0;
		for (int count = 0; count < t[rowIndex].length; count++) {
			total += t[rowIndex][count];
		}
		return total;
	}

	public static double getColumnTotal(double[][] t, int columnIndex) {
		double total = 0;
		for (int count = 0; count < t.length; count++) {
			if (columnIndex <= t[count].length - 1) {
				total += t[count][columnIndex];
			}
		}
		return total;
	}

	public static double getHighestInRow(double[][] t, int rowIndex) {
		double highest = t[rowIndex][0];
		for (int count = 0; count < t[rowIndex].length; count++) {
			if (t[rowIndex][count] > highest) {
				highest = t[rowIndex][count];
		}
		}
		return highest;
	}

	public static int getHighestInRowIndex(double[][] t, int rowIndex) {
		int highestIndex = 0;
		double highest = t[rowIndex][0];
		for (int count = 0; count < t[rowIndex].length; count++) {
			if (t[rowIndex][count] > highestIndex) {
				highest = t[rowIndex][count];
				highestIndex = count;
			}
		}
		return highestIndex;
	}

	public static double getLowestInRow(double[][] t, int rowIndex) {
		double lowest = t[rowIndex][0];
		for (int count = 0; count < t[rowIndex].length; count++) {
			if (t[rowIndex][count] < lowest)
				lowest = t[rowIndex][count];
		}
		return lowest;
	}

	public static int getLowestInRowIndex(double[][] t, int rowIndex) {
		int lowestIndex = 0;
		double lowest = t[rowIndex][0];
		
		for (int x = 0; x < t[rowIndex].length; x++) {
			if (t[rowIndex][x] < lowest) {
				lowest = t[rowIndex][x];
				lowestIndex = x;
			}
		}
		return lowestIndex;
	}

	public static double getHighestInColumn(double[][] t, int columnIndex) {
		double highest = t[0][columnIndex];
		for (int count = 0; count < t.length; count++) {
			if (columnIndex <= t[count].length - 1) {
				if (t[count][columnIndex] > highest) {
					highest = t[count][columnIndex];
				}
			}

		}
		return highest;
	}

	public static int getHighestInColumnIndex(double[][] t, int columnIndex) {
		int highestIndex = 0;
		double highest = t[0][columnIndex];
		
		for (int count = 0; count < t.length; count++) {
			if (columnIndex <= t[count].length - 1) {
				if (t[count][columnIndex] > highest) {
					highest = t[count][columnIndex];
					highestIndex = count;
				}
			}
		}
		return highestIndex;
	}

	public static double getLowestInColumn(double[][] t, int columnIndex) {
		double lowest = t[0][columnIndex];
		for (int count = 0; count < t.length; count++) {
			if (columnIndex <= t[count].length - 1) {
				if (t[count][columnIndex] < lowest) {
					lowest = t[count][columnIndex];
				}
			}
		}
		return lowest;
	}

	public static int getLowestInColumnIndex(double[][] t, int columnIndex) {
		int lowestIndex = 0;
		double lowest = t[0][columnIndex];
		
		for (int count = 0; count < t.length; count++) {
			if (columnIndex <= t[count].length - 1) {
				if (t[count][columnIndex] < lowest) {
					lowest = t[count][columnIndex];
					lowestIndex = count;
				}
			}
		}
		return lowestIndex;
	}

	public static double getHighestInArray(double[][] t) {
		double highest = t[0][0];
		for (int count = 0; count < t.length; count++) {
			for (int i = 0; i < t[count].length; i++) {
				if (t[count][i] > highest) {
					highest = t[count][i];
				}
			}
		}
		return highest;
	}

	public static double getLowestInArray(double[][] t) {
		double lowest = t[0][0];
		for (int count = 0; count < t.length; count++) {
			for (int i = 0; i < t[count].length; i++) {
				if (t[count][i] < lowest) {
					lowest = t[count][i];
				}
			}
		}
		return lowest;
	}
}
