package Practic9;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Module people = new Module("Коннов", 404);
        System.out.println("|Вход в магазин|");
        System.out.println("Здравствуйте, введите вашу фамилию:");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();

        if (name.equals(people.getName())) {
            System.out.println("Фамилия подтверждена");

            Scanner InnScanner = new Scanner(System.in);
            int inn = 0;
            try {
                System.out.println("Введите ИНН:");
                inn = InnScanner.nextInt();
            }catch (InputMismatchException e)
            {
                System.out.println("Данного пользователя нет в базе!");
                System.exit(0);
            }

            if (inn == people.Inn) {
                System.out.println("Данный пользователь найден в системе");
            }
            else {
                try {
                    throw new Exception("Ошибка!");
                }catch (Exception e)
                {
                    System.out.println("Неверный ИНН");
                }
            }
        }
        else  {
            System.out.println("Ошибка входа");
        }

    }
}