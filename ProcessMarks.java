import java.util.Arrays;

public class ProcessMarks {

    // Method to find maximum mark
    public static int max(int[] marks) {
        int maxVal = marks[0];
        for (int m : marks) if (m > maxVal) maxVal = m;
        return maxVal;
    }

    // Method to find minimum mark
    public static int min(int[] marks) {
        int minVal = marks[0];
        for (int m : marks) if (m < minVal) minVal = m;
        return minVal;
    }

    // Method to calculate range
    public static int range(int[] marks) {
        return max(marks) - min(marks);
    }

    // Method to calculate mean
    public static double mean(int[] marks) {
        double sum = 0;
        for (int m : marks) sum += m;
        return sum / marks.length;
    }

    // Method to calculate median
    public static double median(int[] marks) {
        int[] sorted = Arrays.copyOf(marks, marks.length);
        Arrays.sort(sorted);
        int n = sorted.length;
        if (n % 2 == 1) return sorted[n/2];
        return (sorted[n/2 - 1] + sorted[n/2]) / 2.0;
    }

    // Method to calculate mode
    public static int mode(int[] marks) {
        int[] sorted = Arrays.copyOf(marks, marks.length);
        Arrays.sort(sorted);
        int mode = sorted[0];
        int count = 1, maxCount = 1;

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i-1]) count++;
            else count = 1;
            if (count > maxCount) {
                maxCount = count;
                mode = sorted[i];
            }
        }
        return mode;
    }

    // Method to assign grades
    public static char[] grades(int[] marks) {
        char[] gradeArray = new char[marks.length];
        int[] boundaries = {90, 75, 60, 50, 45};
        char[] letters = {'A','B','C','D','E','F'};

        for (int i = 0; i < marks.length; i++) {
            int m = marks[i];
            if (m >= boundaries[0]) gradeArray[i] = 'A';
            else if (m >= boundaries[1]) gradeArray[i] = 'B';
            else if (m >= boundaries[2]) gradeArray[i] = 'C';
            else if (m >= boundaries[3]) gradeArray[i] = 'D';
            else if (m >= boundaries[4]) gradeArray[i] = 'E';
            else gradeArray[i] = 'F';
        }
        return gradeArray;
    }

    // Method to calculate grade distribution
    public static int[] gradeDistn(char[] grades) {
        int[] dist = new int[6]; // A-F
        for (char g : grades) {
            switch (g) {
                case 'A': dist[0]++; break;
                case 'B': dist[1]++; break;
                case 'C': dist[2]++; break;
                case 'D': dist[3]++; break;
                case 'E': dist[4]++; break;
                case 'F': dist[5]++; break;
            }
        }
        return dist;
    }

    // Runnable main method
    public static void main(String[] args) {
        // Sample marks array
        int[] marks = {90, 75, 60, 45, 30, 100, 82, 55, 75, 90, 45, 67, 88, 92, 73, 50, 45, 60};

        System.out.println("Max: " + max(marks));
        System.out.println("Min: " + min(marks));
        System.out.println("Range: " + range(marks));
        System.out.printf("Mean: %.2f%n", mean(marks));
        System.out.println("Median: " + median(marks));
        System.out.println("Mode: " + mode(marks));

        // Display grades
        char[] gradeArray = grades(marks);
        System.out.println("\nGrades:");
        for (int i = 0; i < gradeArray.length; i++) {
            System.out.print(gradeArray[i] + " ");
            if ((i + 1) % 30 == 0) System.out.println(); // 30 per line
        }

        // Display grade distribution
        int[] dist = gradeDistn(gradeArray);
        char[] labels = {'A','B','C','D','E','F'};
        System.out.println("\n\nGrade Distribution:");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(labels[i] + ": " + dist[i]);
        }
    }
}
