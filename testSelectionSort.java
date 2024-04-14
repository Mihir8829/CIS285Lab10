import org.junit.Assert.*;
import org.junit.Assert.assertArrayEquals;

public class testSelectionSort {
    
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
        int[] arr = new int[] { 8, 9, 7, 10, 2 };
        int[] sortedArr = new int[] { 2, 7, 8, 9, 10 };
        selectionSort sorter = new selectionSort();
        int[] result = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }

    public void testNegative() {
        int[] arr = new int[] { -8, -9, -7, -10, -2 };
        int[] sortedArr = new int[] { -10, -9, -8, -7, -2 };
        selectionSort sorter = new selectionSort();
        int[] result = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }

    public void testMixed() {
        int[] arr = new int[] { 8, -9, 0, 10, -2 };
        int[] sortedArr = new int[] { -9, -2, 0, 8, 10 };
        selectionSort sorter = new selectionSort();
        int[] result = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }

    public void testDuplicates() {
        int[] arr = new int[] { 8, 9, 7, 10, 8 };
        int[] sortedArr = new int[] { 7, 8, 8, 9, 10 };
        selectionSort sorter = new selectionSort();
        int[] result = sorter.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }
}
