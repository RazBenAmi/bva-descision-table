package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {
    
	 @Test
	    void testAIsZero_shouldThrowException() {
	        // arrange
	        int a = 0;   // ערך לא חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void testAIsOne_shouldReturnMinimum() {
	        // arrange
	        int a = 10;    // ערך גבול תקין
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(10, result);   // 1 הוא הערך המינימלי
	    }

	public void a_min_minus_1() {
		MinCalculator.findMin(0, 50, 50, 50, 50);
	}
	public void a_min() {
		assertEquals(1, MinCalculator.findMin(1, 50, 50, 50, 50));
	}
	public void a_min_plus_1() {
		assertEquals(2, MinCalculator.findMin(2, 50, 50, 50, 50));
	}
	public void a_nominal() {
		assertEquals(50, MinCalculator.findMin(50, 50, 50, 50, 50));
	}
	public void a_max_minus_1() {
		assertEquals(50, MinCalculator.findMin(999, 50, 50, 50, 50));
	}
	public void a_max() {
		assertEquals(50, MinCalculator.findMin(1000, 50, 50, 50, 50));
	}
	public void a_max_plus_1() {
		MinCalculator.findMin(1001, 50, 50, 50, 50);
	}
}
