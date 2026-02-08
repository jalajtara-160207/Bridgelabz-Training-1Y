public class Even_Odd {

    // Method to print array elements
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        int[] array = { 23, 55, 54, 9, 76, 66, 2, 91 };
        int n = array.length;

        int evenSize = 0, oddSize = 0;

        // First traversal to count even and odd elements
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }

        // Create arrays of exact size
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        int e = 0, o = 0;

        // Second traversal to store elements
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[e++] = array[i];
            else
                odd[o++] = array[i];
        }

        System.out.print("Even Array: ");
        printArray(even);

        System.out.print("Odd Array: ");
        printArray(odd);
    }
}