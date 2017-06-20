package com.company;

import java.util.*;

public class Test {

    public static void main(String args[]) {


    Scanner answ = new Scanner(System.in);
    int answer;
        System.out.println("2 + 2 = ?");
        System.out.println("Выберите вариант ответа: ");
        System.out.println("1)  4");
        System.out.println("2)  5");
        System.out.println("3)  1");
        System.out.println("4)  2");
        System.out.println();
        answer = answ.nextInt();
        switch (answer){
            case 1: System.out.println("Правильный ответ!");
            break;
            case 2: System.out.println("Неправильный ответ!");
            break;
            case 3: System.out.println("Неправильный ответ!");
            break;
            case 4: System.out.println("Неправильный ответ!");
            break;
            default: System.out.println("Некорректный ответ!");
        }


    }
}
























