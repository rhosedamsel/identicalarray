import java.util.Scanner;

public class identicalarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first 3x3 array
        System.out.println("Enter the elements of the first 3x3 array:");
        int[][] m1 = readMatrix(input);

        // Prompt the user to enter the second 3x3 array
        System.out.println("Enter the elements of the second 3x3 array:");
        int[][] m2 = readMatrix(input);

        // Check if the two arrays are identical and display the result
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    // Method to read a 3x3 matrix from the user
    public static int[][] readMatrix(Scanner input) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    // Method to check if two 3x3 arrays are identical
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
