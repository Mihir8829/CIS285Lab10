
public class selectionSort {
    private int temp;

    /** Creates a new instance of SelectionSort */
    public selectionSort() {
    }

    /*
     * A simple SelectionSort algorithm
     * pre-condition:
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp; //fixes done here
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    }
}
