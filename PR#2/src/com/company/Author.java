package com.company;

public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String a, String b, char c)
    {
        name = a;
        email = b;
        gender = c;
    }
    public String getName(String name)
    {
        return name;
    }
    public String getEmail(String email)
    {
        return email;
    }
    public char getGender(char gender)
    {
        return gender;
    }
    public void setEmail(String d)
    {
        this.email = d;
    }
    public String toString()
    {
        return name+", email "+email+", gender "+gender;
    }

}
