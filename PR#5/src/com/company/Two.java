package com.company;

public class Two {
    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
}

//4. Заданная сумма цифр
//Даны натуральные числа k и s. Определите, сколько существует k-значных
//натуральных чисел, сумма цифр которых равна d. Запись натурального числа не
//может начинаться с цифры 0.
//В этой задаче можно использовать цикл для перебора всех цифр, стоящих
//на какой-либо позиции.