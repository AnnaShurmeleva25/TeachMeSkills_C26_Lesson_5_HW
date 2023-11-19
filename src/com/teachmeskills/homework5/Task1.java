package com.teachmeskills.homework5;
//Шахматная доска
// Создать программу для раскраски шахматной доски с помощью цикла.
// Создать двумерный массив String'ов 8х8. С помощью циклов задать
// элементам циклам значения B(Black) или W(White)

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
            String[][] board = new String[8][8];
            for (int i = 0; i < board.length; i++) {
                for (int a = 0; a < board[i].length; a++) {
                    if(i%2 == 0 && a%2 == 0){
                        board[i][a] = "W";
                    } else if(i%2 == 0){
                        board[i][a] = "B";
                    }
                    if(i%2 != 0 && a%2 == 0){
                        board[i][a] = "B";
                    } else if(i%2 != 0){
                        board[i][a] = "W";
                    }
                }
            }
            System.out.println(Arrays.deepToString(board[0]));
            System.out.println(Arrays.deepToString(board[1]));
            System.out.println(Arrays.deepToString(board[2]));
            System.out.println(Arrays.deepToString(board[3]));
            System.out.println(Arrays.deepToString(board[4]));
            System.out.println(Arrays.deepToString(board[5]));
            System.out.println(Arrays.deepToString(board[6]));
            System.out.println(Arrays.deepToString(board[7]));
    }
}
