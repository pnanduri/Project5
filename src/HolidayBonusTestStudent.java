import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

	double[][] arr = {{2,5, 2, 8, 3, 6},{2, -3, -2, -5, 3},{4, 2, 5},{3, 4, 4, 5, 3},{3, 4, 4},{2, 3, 2, 9, 5}};


	@Test
	void testCalculateHolidayBonus() {
		double[] output = HolidayBonus.calculateHolidayBonus(arr);
		assertTrue(output[0] == 20000);
		assertTrue(output[1] == 10000);
		assertTrue(output[2] == 15000);
		assertTrue(output[3] == 10000);
		assertTrue(output[4] == 5000);
		assertTrue(output[5] == 15000);
	}
	
	@Test
	void testCalculateTotalHolidayBonus(){
		assertTrue(HolidayBonus.calculateTotalHolidayBonus(arr) == 70000);
	}

}