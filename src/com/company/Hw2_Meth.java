package com.company;

/**
 * Created by andy on 15.10.2017.
 */
public class Hw2_Meth {
    //   четное или нечетное чило
    public static void task1(int n) {
        if (n % 2 == 0)
            System.out.println(n + " четное число");
        else
            System.out.println(n + " нечетное число");
    }
    // ближайшее к 10 число
    public static double task2(double m, double n) {
        if ((m - 10) > (n - 10)) return n;
        else return m;
    }
    public static void task4() {
        double n;
        for (int i = 0; ; i++) {
            n = Math.random() * 200;
            if (n >= 5 && n <= 155) break;
        }
        if (n > 25 && n < 100)
            System.out.println("Число " + (int) n + " попадает в диапазон между 25 и 100");
        else
            System.out.println("Число " + (int) n + " не попадает в диапазон между 25 и 100");
    }
    public static void task5() {
        int num, max = 0, n;
        n = (int) (Math.random() * 1000);
        int n1 = n;
        for (int i = 0; i < (Math.log10(n) + 1); i++) {
            n /= 10;
            num = n % 10;
            if (num > max) max = num;
        }
        System.out.println("Число: " + n1 + " наибольшая цифра: " + max);
    }
    public static void task6(int a, int b, int c) {
//        int min = a, mid = b, max = c;
        int temp;
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Три числа по возрастанию: " + arr[0] + " " + arr[1] + " " + arr[2]);
    }
    public static void task7(int n) {
        if (n < 0 && n > 28800)
            System.out.println("Введите число между 0 и 28800");
        else {
            int nh;
//            System.out.println(nh);
            for (int i = n; i > 0; i--) {
                nh = (int) (n / 60 / 60);
                if (nh == 8) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 7) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 6) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 5) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 4) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 3) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 2) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh == 1) {
                    System.out.println(n + "\n" + "Осталось " + nh + " часов");
                    break;
                }
                if (nh <= 1) {
                    System.out.println(n + "\n" + "Осталось менее часа");
                    break;
                }

            }
        }
    }
    // Циклы в Java
    public static int task8(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void task9(int n) {
        System.out.print("Делитиели числа " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task10(int n) {
        boolean b = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) b = false;
            break;
        }
        if (b) System.out.println(n + " - простое число");
        else System.out.println(n + " - составное число число");
    }
    //    Число Фибоначчи(ряд из 11)
    public static void task11() {
        int n = 0;
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("Последовательность Фибоначчи: ");
        for (int i = 0; i <= 10; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    //  Сумма всех цифр введенного числа
    public static int task12(int n) {
        int sum = 0;
        for (int i = 0; n > 1; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	public static void task13(){
        int num = 0, count =0, t1, t2, sumT1=0, sumT2=0, d1, d2, d3;
        while(num<=999999){
            num++;
            t1 = num/1000;//первые три цыфры числа
            t2 = num%1000;//последние три цифры числа
            for(int i = 0 ; i < 3; i++){
                d1 = t1/100;
                d2 = (t1/10)%10;
                d3 = t1%10;
                sumT1 = d1 + d2 + d3;
            }
            for(int i = 0 ; i < 3; i++){
                d1 = t2/100;
                d2 = (t2/10)%10;
                d3 = t2%10;
                sumT2 = d1 + d2 + d3;
            }
            if(sumT2==sumT1) count++;
        }
	    System.out.println("Количество счастливых билетов в рулоне: "+ count);
    }
    public static int task14() {
        int count = 0;
        for (int i = 0; i < 50000; i++) {
            if (String.valueOf(i).contains("2")) count++;
        }
        return count;
    }
    //    Симметричное время
    public static void task15() {
        int count = 0;
        String[] arrH = new String[24];
        for (int i = 0; i < 24; i++) {
            if (i <= 9)
                arrH[i] = String.valueOf(0) + String.valueOf(i);
            else arrH[i] = String.valueOf(i);
        }
        String[] arrM = new String[60];
        for (int i = 0; i < 60; i++) {
            if (i <= 9)
                arrM[i] = String.valueOf(0) + String.valueOf(i);
            else arrM[i] = String.valueOf(i);
        }
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if ((arrH[i].charAt(1) == arrM[j].charAt(0)) && (arrH[i].charAt(0) == arrM[j].charAt(1)))
                    count++;
            }
        }
        System.out.println("Зеркальное время - количество повторений за сутки: " + count);
    }
//    Исключение 4 и 13
    public static void task16(){
        int count =0;
        for (int n = 1; n<100000; n++){
        if(String.valueOf(n).contains("4")||String.valueOf(n).contains("13")) count++;
        }
        System.out.println("Количество единиц техники содержащих в номере цифры 4 и 13: " + count);
    }
}



