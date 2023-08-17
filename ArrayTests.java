import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input1 = {0, 1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 4, 3, 2, 1, 0}, input1);
  }

  @Test
  public void testReversed1() {
    int[] input1 = {0, 1, 2, 3, 4};
    assertArrayEquals(new int[] { 4, 3, 2, 1, 0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestMultipleLowestValues() {
    double[] inputArray = {2.0, 3.0, 4.0, 2.0, 2.0};
    double expectedAverage = (3.0 + 4.0) / 2; // Excluding all 2.0 values, then dividing by 2 (length of array minus count of lowest value)
    assertEquals(expectedAverage, ArrayExamples.averageWithoutLowest(inputArray), 0.001); // The third parameter is a delta for floating-point comparisons
}


}
