package com.company;

public class Main {

    public static void main(String[] args) {
        double [] arr = {10.2, 3.3, -1.9, 0.3, 5.5, 12.3, 8.7, -9.9, 10.2, 1.2, 4.8, -6.3, 9.1, 1.8, 2.3};
        double kol = 0;
        double sum = 0;
        boolean is0tr = false;
        for (double num : arr ) {
            if (num < 0) {
                is0tr = true;
            } else {
                if (is0tr == true) {
                    kol ++;
                    sum += num;
                }

        }
        }
        System.out.println("Ваше арифметическое число:  " + sum / kol);

            
        }


}
