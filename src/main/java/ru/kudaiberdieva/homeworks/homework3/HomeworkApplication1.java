package ru.kudaiberdieva.homeworks.homework3;

import java.util.Scanner;

public class HomeworkApplication1 {

    public static void main(String[] args) {
        //chooseTask();
        System.out.println("Задача 1:");
        greetings();
        System.out.println();
        System.out.println("Задача 2:");
        checkSign(2, 3, 4);
        System.out.println();
        System.out.println("Задача 3:");
        selectColor();
        System.out.println();
        System.out.println("Задача 4:");
        compareNumbers();
        System.out.println();
        System.out.println("Задача 5:");
        addOrSubtractAndPrint(12, 32, false);
    }


    //Задача 1 метод greetings()

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //Задача 2 метод checkSign()

    public static void checkSign(int a, int b, int c) {


//       для задания *
//       a = getRandom();
//       b = getRandom();
//       c = getRandom();

        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println(sum + "-" + "Сумма положительная");
        } else {
            System.out.println(sum + "-" + "Сумма отрицательная");
        }
    }

    static int getRandom() {
        int min = -200000;
        int max = 200000;
        return (int) (Math.random() * (max - min) + 1) + min;
    }

    //Задача 3 метод selectColor()

    public static void selectColor() {
        int data = 12;

        // для задания *
        //int data = getRandom();

        if (data <= 10) {
            System.out.println("красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("желтый");
        }
        if (data > 20) {
            System.out.println("зеленый");
        }
    }

    //Задача 4 метод compareNumbers()

    public static void compareNumbers() {
        int a = 23;
        int b = -14;

        // для задания *
//      int a = getRandom();
//      int b = getRandom();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Задача 5 метод addOrSubtractAndPrint()

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        // для задания *
        //Scanner console = new Scanner(System.in);
        //initValue = getRandom();
        //delta = getRandom();
        // increment = console.nextBoolean();
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
    // для задания * метод chooseTask

//      public static void chooseTask() {
//        System.out.println("выберите число от 1 до 5");
//        Scanner scanner = new Scanner(System.in);
//        int option = scanner.nextInt();
//        if(option<=5) {
//            switch (option) {
//                case 1:
//                    greetings();
//                    break;
//                case 2:
//                    checkSign();
//                    break;
//                case 3:
//                    selectColor();
//                    break;
//                case 4:
//                    compareNumbers();
//                    break;
//                case 5:
//                    addOrSubtractAndPrint();
//                    break;
//            }
//        }else {
//            System.out.println("ваше число не соответсвует условию");
//        }
//    }
}

