package com.company;

import java.util.Scanner;

public class Hw2 {

    public static void main(String[] args) {
//      Условный оператор
        Hw2_Meth.task1(88);

        System.out.println("Ближайшее к 10 число из двух: " + Hw2_Meth.task2(23, 5.75));

        Hw2_Meth.task3(1,3,-4);

        Hw2_Meth.task4();

//      Ветвления в программе
        Hw2_Meth.task5();

        Hw2_Meth.task6(15,13,7);

        Hw2_Meth.task7(200);

//      Циклы в Java
//      Циклы 1
        for (int n = 1000; n<10000; n +=3)
            System.out.print(n + " ");
        System.out.println();

//      Циклы 2
        int m =0;
        for (int i =1; m <= 55; i+=2) {
            System.out.print(i+" ");
            m++;
        }
        System.out.println();

//      Циклы 3
        for (int i = 80; i>=0; i-=5)
            System.out.print(i+" ");
        System.out.println();

//      Циклы 4
        int n =0;
        for(int i = 2; n <=20; i+=i) {
            System.out.print(i + " ");
            n++;
        }
        System.out.println();

//      Циклы 5
        Scanner scn1 = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int s1 = scn1.nextInt();
        System.out.println("Факторифл числа "+ s1 + ": " + Hw2_Meth.task8(s1));

//      Циклы 6
        Scanner scn2 = new Scanner(System.in);
        System.out.print("Введите число для вычисления делителей: ");
        int s2 = scn2.nextInt();
        Hw2_Meth.task9(s2);

//      Циклы 7
        Scanner scn3 = new Scanner(System.in);
        System.out.print("Введите число для проверки(простое или нет): ");
        int s3 = scn3.nextInt();
        Hw2_Meth.task10(s3);

//      Циклы 8
        Hw2_Meth.task11();

//      Циклы 9
        System.out.print("Введите число : ");
        Scanner scn4 = new Scanner(System.in);
        int s4 = scn4.nextInt();
        System.out.println("Cумма цифр введенного числа: " + Hw2_Meth.task12(s4));

//      Циклы 10
        Hw2_Meth.task13();

//      Циклы 11
        System.out.println("Количество появлений цифры 2 в числе 50000: " + Hw2_Meth.task14());

//      Циклы 12
        Hw2_Meth.task15();

//      Циклы 13
        Hw2_Meth.task16();
    }

}
