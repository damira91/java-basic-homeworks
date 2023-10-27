package ru.kudaiberdieva.homeworks.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkApplication2 {

    public static void main(String[] args) {

        // Задача 1
        printStr("hi", 3);

        //Задача 2
        sumElements(new int[] {2,5,8,7,9,11});

        // Задача 3
        int[] numArray  = new int [6];
        fillArray(6,numArray);

        //Задача 4
        int[] array = new int[5];
        increaseElement(5, numArray);

        //Задача 5
        int[] elements = {2,8,7,9,6,4,2,14};
        compareArrayHalfs(elements);

        // Задача 1*
        arraysSum(numArray, array, elements);
        // Задача 2*
        int[] arr = {1,2,3};
        System.out.println(checkEquality(arr));
        // Задача 3*
        int[] figures = {10,20,92};
        boolean isOrdered = checkArrayOrder(figures, true);
        if(isOrdered){
            System.out.println("yes array is ordered");
        } else {
            System.out.println("no array is not ordered");
        }
        // Задача 4*
        int[] nums = {2,6,8,7,3,1};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Задача 1

    public static void printStr(String s, int a){

        for(int i = 0; i< a; i++) {
            System.out.println(s);
        }
    }

    // Задача 2

    public static void sumElements(int[] numbers){
        int sum = 0;
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i]>5){
                sum+=numbers[i];
            }
        }
        System.out.println(sum);
        }

    // Задача 3

    public static void fillArray(int number,int[]numbers){

        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = number;
        }
        System.out.println(Arrays.toString(numbers));
    }

    // Задача 4

    public static void increaseElement(int increment, int[]numArray){

        for (int i = 0; i < numArray.length; i++) {
             //int start = numArray[i] + increment;
             numArray[i] += increment;

        }
        System.out.println(Arrays.toString(numArray));
    }

    // Задача 5

    public static void compareArrayHalfs(int[] elements){
        int firstHalfSum = 0;
        for (int i = 0; i < elements.length/2; i++){
            firstHalfSum += elements[i];
        }
        int secondHalfSum = 0;
        for(int i=elements.length-1; i>=elements.length/2; i--){
            secondHalfSum +=elements[i];
        }
        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма элементов первой половины массива больше второй");
        } else if(firstHalfSum == secondHalfSum) {
            System.out.println("Сумма элементов первой половины массива равна сумме второй половины массива");
        } else {
            System.out.println("Сумма элементов второй половины массива больше первой");
        }

    }
    // Задача 1 *

    public static void arraysSum (int[] arr1,int[] arr2,int[] arr3 ) {

        int maxLength = Math.max(arr1.length, arr2.length);
        maxLength = Math.max(maxLength, arr3.length);

        int[] sumArr = new int[maxLength];
        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sumArr[i] = sumArr[i] + arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            sumArr[i] = sumArr[i] + arr3[i];
        }
        System.out.println(Arrays.toString(sumArr));
    }
        // Задача 2 *

        public static boolean checkEquality(int[]array){

            int start = 0;
            int end;
            boolean equality = false;
            for (int i = 0; i < array.length; i++) {
                start += array[i];
                end = 0;
                if(!equality){
                    for(int j=array.length-1; j>i; j--){
                        end+=array[j];
                    }
                    if(start == end){
                        equality = true;
                    }
                }
            }
            return equality;
        }
        // Задача 3 *
        public static boolean checkArrayOrder(int[] array, boolean isOrderedByAsc){

            for (int i = 1; i < array.length; i++) {

                if(isOrderedByAsc) {
                  if( array[i] <= array[i-1]==isOrderedByAsc){
                      return false;
                  }
                }
            }
            return true;
        }
        // Задача 4 *
        public static void reverseArray(int[] array){

            for (int i = 0; i < array.length/2 ; i++) {
                int exchange = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i]= exchange;
            }
        }
}

