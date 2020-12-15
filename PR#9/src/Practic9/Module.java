package Practic9;
import java.util.Scanner;

public class Module {
    String name;
    int Inn;
    public Module(String name,int inn)
    {
        this.name = name;
        this.Inn = inn;
    }
    public int getInn()
    {
        return Inn;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}