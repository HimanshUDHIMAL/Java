public class Index {

    // Linear search method
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i; // return the index of the key
            }
        }
        return -1; // return -1 if key not found
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        int i = linearSearch(list, 4);   // should return 1
        int j = linearSearch(list, -4);  // should return -1
        int k = linearSearch(list, -3);  // should return 5

        System.out.println("Index of 4: " + i);
        System.out.println("Index of -4: " + j);
        System.out.println("Index of -3: " + k);
    }
}
