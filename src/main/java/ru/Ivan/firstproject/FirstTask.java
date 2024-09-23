package ru.Ivan.firstproject;

import java.util.Scanner;

public class FirstTask
{

    public static void main(String[] args)
    {
        boolean comp = false;
        while(!comp)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Здравствуйте, выберите метод:");
            String meth = scanner.nextLine();


            switch (meth)
            {
                case "1":
                    greetings();
                    comp = true;
                    break;
                case "2":
                    checkSign((int)(Math.random() * 10), (int)(Math.random() * 10), (int)(Math.random() * 10));
                    comp = true;
                    break;
                case "3":
                    selectColor((int)(Math.random() * 50));
                    comp = true;
                    break;
                case "4":
                    compareNumber((int)(Math.random() * 10), (int)(Math.random() * 10));
                    comp = true;
                    break;
                case "5":
                    addOrSubtractAndPrint((int)(Math.random() * 10), (int)(Math.random() * 10), (Math.random() * 10 % 2) != 0);
                    comp = true;
                    break;
            }
        }
    }

    public static void greetings()
    {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c)
    {
        if  (a + b + c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void selectColor(int data)
    {
     if (data <= 10) System.out.println("Красный");
     else if (data <= 20) System.out.println("Желтый");
     else System.out.println("Зеленый");
    }

    public static void compareNumber(int a, int b)
    {
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment)
    {
        if (increment) System.out.println(initValue + delta);
        else System.out.println(initValue - delta);
    }
}
