package com.teachmeskills.homework5;
//Создать трехмерный массив из целых чисел.
// С помощью циклов "пройти" по всему массиву и увеличить каждый
// элемент на заданное число. Пусть число, на которое будет
// увеличиваться каждый элемент, задается из консоли.

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        int [][][] integer = {{{1,2,3},{7,8,9},{19,32,12}},{{99,65,23},{89,93,51},{83,82,999}}};
        System.out.println("Array value: ");
        System.out.println(Arrays.deepToString(integer));
        System.out.println("Enter a number to increase each element: ");
        Scanner scan = new Scanner(System.in);
        int increase = scan.nextInt();
        for (int i = 0; i < integer.length; i++) {
            for (int a = 0; a < integer[i].length; a++) {
                for (int j = 0; j < integer[i][j].length; j++) {
                    integer[i][a][j] += increase;
                }
            }
        }
        System.out.println(Arrays.deepToString(integer));
    }
}
