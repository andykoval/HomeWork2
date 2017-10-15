package com.company;

/**
 * Created by andy on 15.10.2017.
 */
public class Hw2_Meth {

        //   четное или нечетное чило
    public static void task1(int n){
            if(n%2==0)
                System.out.println(n + " четное число");
            else
                System.out.println(n + " нечетное число");
        }
        // ближайшее к 10 число
    public static double task2(double m, double n){
            if((m-10)>(n-10)) return n;
            else return m;
        }
    public static void task4(){
        double n;
        for(int i =0;;i++){
            n = Math.random() * 200;
            if(n>=5&&n<=155) break;
        }
        if(n>25&&n<100)
            System.out.println("Число "+ (int)n + " попадает в диапазон между 25 и 100");
        else
            System.out.println("Число "+ (int)n + " не попадает в диапазон между 25 и 100");
    }

    public static void task5(){
        int num, max =0, n;
        n = (int)(Math.random()* 1000);
        int n1 = n;
        for(int i =0; i<(Math.log10(n)+1); i++) {
            n /= 10;
            num = n % 10;
            if(num>max) max = num;
        }
        System.out.println("Число: " + n1 + " наибольшая цифра: " + max);
    }

    public static void task6(int a, int b, int c) {
//        int min = a, mid = b, max = c;
    int temp;
    int [] arr = new int[3];
    arr[0]= a;
    arr[1]= b;
    arr[2]= c;
    for (int i =0; i<2; i++){
        for(int j =0; j<2; j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println("Три числа по возрастанию: " + arr[0]+" "+arr[1]+" "+arr[2]);
    }
    public static void task7(int n){
        if (n<0&&n>28800)
            System.out.println("Введите число между 0 и 28800");
        else {
            int nh;
//            System.out.println(nh);
            for (int i = n; i > 0; i-- ) {
                nh = (int) (n / 60 / 60);
                if (nh == 8){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 7){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 6){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 5){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 4){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 3){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 2){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh == 1){
                    System.out.println(n+"\n"+"Осталось "+ nh + " часов");
                    break;
                }
                if (nh <= 1) {
                    System.out.println(n + "\n" + "Осталось менее часа");
                    break;
                }

            }
        }
        }
}
