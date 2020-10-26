package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the necessary text: ");
        String word = in.nextLine();
        System.out.print("You entered: " + word + "\n");
        String a0 = " ";
        String a1 = " ";
        String a2 = " ";
        String a3 = " ";
        String a4 = " ";
        String a5 = " ";

        for(int index = 0; index < word.length(); ++index) {
            switch(word.charAt(index)) {
                case ' ':
                    a0 = a0 + "           ";
                    a1 = a1 + "           ";
                    a2 = a2 + "           ";
                    a3 = a3 + "           ";
                    a4 = a4 + "           ";
                    a5 = a5 + "           ";
                    break;
                case '1':
                    a0 = a0 + "     ### ";
                    a1 = a1 + "  ###### ";
                    a2 = a2 + "      ## ";
                    a3 = a3 + "      ## ";
                    a4 = a4 + "      ## ";
                    a5 = a5 + "     ### ";
                    break;
                case '2':
                    a0 = a0 + " ####   ";
                    a1 = a1 + "#   #  ";
                    a2 = a2 + "       #   ";
                    a3 = a3 + "      #        ";
                    a4 = a4 + " #      ";
                    a5 = a5 + "   ######   ";
                    break;
                case '3':
                    a0 = a0 + "    ####   ";
                    a1 = a1 + "    #   #  ";
                    a2 = a2 + "      ##   ";
                    a3 = a3 + "       ##  ";
                    a4 = a4 + "   #     # ";
                    a5 = a5 + "    #####   ";
                    break;
                case 'I':
                    a0 = a0 + " ##### ";
                    a1 = a1 + "   #   ";
                    a2 = a2 + "   #   ";
                    a3 = a3 + "   #   ";
                    a4 = a4 + "   #   ";
                    a5 = a5 + " ##### ";
                    break;
                case 'T':
                    a0 = a0 + "###### ";
                    a1 = a1 + "     ##      ";
                    a2 = a2 + "     ##      ";
                    a3 = a3 + "     ##      ";
                    a4 = a4 + "     ##      ";
                    a5 = a5 + "  ##      ";
                    break;
                case 'V':
                    a0 = a0 + " #         # ";
                    a1 = a1 + "  #       #  ";
                    a2 = a2 + "   #     #   ";
                    a3 = a3 + "    #   #    ";
                    a4 = a4 + "     # #     ";
                    a5 = a5 + "      #      ";
            }
        }

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}