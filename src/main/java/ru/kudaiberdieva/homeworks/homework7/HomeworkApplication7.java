package ru.kudaiberdieva.homeworks.homework7;


public class HomeworkApplication7 {

    public static void main(String[] args) {
        // Задача 1
        int[][] nums = {{5, 7, 9, 6}, {-2, 6, 9, 7, -4}};
        System.out.println(sumOfPositiveElements(nums));
        System.out.println();
        // Задача 2
        drawSquare(4);
        System.out.println();
        // Задача 3
        int[][] numbers = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {2, 2, 2, 2}};
        zeroDiagonal(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        // Задача 4
        int[][] matrix = {{-9, -3, -1, 2}, {0, 4, -7, 4}, {17, 5, 5, 10}};
        System.out.println(findMax(matrix));
        System.out.println();
        // Задача 5
        int[][] array2d = {{1,2},{2,3,4,5},{4,5,6}};
        System.out.println(sumOfSecondRow(array2d));
    }

    // Задача 1
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] >= 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
        // Задача 2

    public static void drawSquare(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        // Задача 3

    public static void zeroDiagonal(int[][] array) {
        for(int i=0; i< array.length; i++){
            array[i][i] = 0;
            array[array.length-1-i][i]=0; // в этом случае вывод будет тогда в main
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j || i + j == array.length - 1) {
//                    array[i][j] = 0;
//                }
//
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }
    }
        // Задача 4

    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    // Задача 5
    public static int sumOfSecondRow(int[][] matrix) {
        int sumSecondRow = 0;
        if (matrix.length >= 2) {
            for (int i = 0; i < matrix[1].length; i++) {
                sumSecondRow += matrix[1][i];
            }
            return sumSecondRow;
        }
        return -1;
    }
}

