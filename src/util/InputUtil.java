package util;

import java.util.Scanner;

public class InputUtil
{
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info)
    {
        System.out.println(info + " : ");
        String inputan = scanner.nextLine();
        return inputan;
    }

    public static String printEqual()
    {
        for (int i = 0 ; i<20;i++){
            System.out.print("=");
        }
        System.out.println("");
        return " " ;
    }
}
