1a. 
public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int width = 15;
        int height = 9;
        String green = "G";
        String white = " ";

        for (int i = 0; i < height * width; i++) {
            if ((i % width) < width / 3 || (i % width) >= 2 * width / 3) {
                System.out.print(green);
            } else {
                System.out.print(white);
            }

            if ((i + 1) % width == 0) {
                System.out.println();
            }
        }
    }
}

1b.
public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int width = 15;
        int height = 9;
        String green = "G";
        String white = " ";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < width / 3 || j >= 2 * width / 3) {
                    System.out.print(green);
                } else {
                    System.out.print(white);
                }
            }
            System.out.println();
        }
    }
}

2) 
Using a single loop
 
import java.util.Scanner
public class Main {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 9; // Total characters per row (including spaces)

        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < columns; j++) {
                if (i < 3 && j < 3) {
                    row.append("*"); // Top three rows, first three stars
                } else {
                    row.append("="); // All equals in other parts
                }
            }
            System.out.println(row);
        }
    }
}

Using a nested loop
import java.util.Scanner 
public class Main {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 9; // Total characters per row (including spaces)

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i < 3 && j < 3) {
                    System.out.print("*"); // Top three rows, first three stars
                } else {
                    System.out.print("="); // All equals in other parts
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
3 
 import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        int[] array = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        double mean = calculateMean(array);
        double median = calculateMedian(array);
        double standardDeviation = calculateStandardDeviation(array, mean);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }

    public static double calculateStandardDeviation(int[] array, double mean) {
        double sum = 0;
        for (int num : array) {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / array.length);
    }
}

4 
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10];

        // Loop to accept input and assign to the array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe values entered are:");

        // For-each loop to print out the input entered by the user
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

5
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10];

        // Loop to accept input and assign to the array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe values entered are:");

        // For-each loop to print out the input entered by the user
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

