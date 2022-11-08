import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;

class TwoDimRaggedArrayUtilityTestStudent {

	double[][] arr ={{2,5, 2, 8, 3, 6},{2, -3, -1, -5, 3},{4, 2, 5},{2, 3, 4, 5, 3},{3, 3, 3},{2, 3, 2, 8, 5}};
	
	@Test
	void testreadFile() {
		File file = new File("file.txt");
		TwoDimRaggedArrayUtility.writeToFile(arr, file);
		double[][] a = TwoDimRaggedArrayUtility.readFile(file);
		for (int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				assertTrue(arr[i][j] == a[i][j]);
	}
	
	@Test
	void testGetTotal() {
		assertTrue(TwoDimRaggedArrayUtility.getTotal(arr) == 90);
	}

	@Test
	void testGetAverage() {
		assertTrue(Math.floor(TwoDimRaggedArrayUtility.getAverage(arr)) == 10);
	}

	@Test
	void testGetHighestInArray() {
		assertTrue(TwoDimRaggedArrayUtility.getHighestInArray(arr) == 10);
	}

	@Test
	void testGetLowestInArray() {
		assertTrue(TwoDimRaggedArrayUtility.getLowestInArray(arr) == -5);
	}

	@Test
	void testGetRowTotal() {
		assertTrue(Math.round(TwoDimRaggedArrayUtility.getRowTotal(arr,2) * 100.0) / 100.0 == 15);
	}

	@Test
	void testGetHighestInRow() {
		assertTrue(TwoDimRaggedArrayUtility.getHighestInRow(arr,0) == 10);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertTrue(TwoDimRaggedArrayUtility.getHighestInRowIndex(arr,0) == 5);
	}

	@Test
	void testGetLowestInRow() {
		assertTrue(TwoDimRaggedArrayUtility.getLowestInRow(arr,2) == 5);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertTrue(TwoDimRaggedArrayUtility.getLowestInRowIndex(arr,4) == 0);
	}

	@Test
	void testGetColumnTotal() {
		assertTrue(Math.round(TwoDimRaggedArrayUtility.getColumnTotal(arr,1) * 100.0) / 100.0 == 20);
	}

	@Test
	void testGetHighestInColumn() {
		assertTrue(TwoDimRaggedArrayUtility.getHighestInColumn(arr,0) == 5);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertTrue(TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr,1) == 0);
	}

	@Test
	void testGetLowestInColumn() {
		assertTrue(TwoDimRaggedArrayUtility.getLowestInColumn(arr,2) == -5);
	}

	@Test
	void testGetLowestInColumnIndex() {
		System.out.println(TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr,3));
		assertTrue(TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr,3) == 1);
	}

	

	@Test
	void testWriteToFile() throws FileNotFoundException{
		File file = new File("file.txt");
		TwoDimRaggedArrayUtility.writeToFile(arr, file);
		double[][] a = TwoDimRaggedArrayUtility.readFile(file);
		for (int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				assertTrue(arr[i][j] == a[i][j]);		
	}
}
