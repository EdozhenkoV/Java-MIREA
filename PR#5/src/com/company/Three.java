package com.company;

public class Three {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }
}

//5. Сумма цифр числа
//Дано натуральное число N. Вычислите сумму его цифр.