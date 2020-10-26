package com.company;

public class AuthorTest
{
    public static void main(String[] args)
    {
        Author d1 = new Author("Nijhil Buduma", "DeepLearningBasics", 'm');
        Author d2 = new Author("St.Levitt", "Freakonomics", 'm');
        Author d3 = new Author("Artur Honnegger", "ILoveTrains(231)", 'm');

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
