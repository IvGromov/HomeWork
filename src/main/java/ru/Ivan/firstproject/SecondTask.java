package ru.Ivan.firstproject;

import java.util.Arrays;

public class SecondTask
{
    public static void main(String[] args)
    {
        int[] Array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            Array[i] = (int)(Math.random() * 10);
        }
        ConsoleText(10, "Привет");
        halfof(Array);
        SumMass(Array);
        Array = plus(Array, (int)(Math.random() * 10));
        System.out.println(Arrays.toString(Array));
        Array = fill(Array,(int)(Math.random() * 10));
        System.out.println(Arrays.toString(Array));
    }

    public static void ConsoleText(int times, String stroke)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println(stroke);
        }
    }

    public static void SumMass(int[] array)
    {
        int Sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 5) Sum+= array[i];
        }
        System.out.println(Sum);
    }

    public static int[] fill(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = number;
        }
        return array;
    }

    public static int[] plus(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] += number;
        }
        return array;
    }
    public static void halfof(int[] array)
    {
        int Sum1 = 0;
        int Sum2 = 0;
        for (int i = array.length; i < array.length / 2; i++)
        {
            Sum1 += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++)
        {
            Sum2 += array[i];
        }
        if (Sum1 > Sum2) System.out.println("Первая половина больше");
        else if (Sum1 == Sum2) System.out.println("Обе половины равны");
        else System.out.println("Вторая половина больше");
    }
}


