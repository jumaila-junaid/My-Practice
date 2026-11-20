import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Test.array();
        // Test.twodarray();
        Test.threedarray();
    }

    public static void array() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(arr[0]);

        int[] array = new int[2];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public static void twodarray() {
        System.out.println("Enter the row: ");
        int row = input.nextInt();
        System.out.println("Enter the colum: ");
        int colum = input.nextInt();

        int[][] arr = new int[row][colum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void threedarray() {
        System.out.println("Enter the table depth: ");
        int depth = input.nextInt();
        System.out.println("Enter the row: ");
        int row = input.nextInt();
        System.out.println("Enter the colum: ");
        int colum = input.nextInt();

        int[][][] arr = new int[depth][row][colum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("Enter number [" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = input.nextInt();
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
