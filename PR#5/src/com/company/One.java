package com.company;

public class One {
    public static void recursion(int a,int b) {

        if (b > a) {
            System.out.println(a);
            if (b <= a) {
                return;
            }
            recursion(a + 1, b);
        }

        else {
            System.out.println(a);
            if (b >= a) {
                return;
            }
            recursion(a - 1, b);
        }
    }
}

//3. От A до B
//Даны два целых числа A и В (каждое в отдельной строке). Выведите все
//числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
//убывания в противном случае.