package ru.Ivan.firstproject;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args)
    {
        int[][] Array = new int[30][30];
        for (int i = 0; i < 30; i++)
        {
            for (int j = 0; j < 30; j++)
            {
                Array[i][j] = (int)(Math.random() * 10);
            }
        }
        square(15);
        int sum1 = sumOfPositiveElements(Array);
        int[][] sum2 = nulldiag(Array, 3);
        int sum3 = findMax(Array);
        int sum4 = sumofSecondrow(Array);
        System.out.println(sum1);
        for (int i = 0; i < Array.length; i++)
        {
            for (int j = 0; j < Array[0].length; j++)
            {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum3);
        System.out.println(sum4);
    }



    public static int sumOfPositiveElements(int[][] Array)
    {
        int sum = 0;
        for (int i = 0; i < Array.length; i++)
        {
            for (int j = 0; j < Array[i].length; j++)
            {
                if (Array[i][j] > 0) sum += Array[i][j];
            }
        }
        return sum;
    }
    public static void square(int num)
    {
        String line = "";
        for (int i = 0; i < num; i++)
        {
            line += "*";
        }
        for (int i = 0; i < num; i++)
        {
            System.out.println(line);
        }
    }
    public static int[][] nulldiag(int[][] Array, int mode)
    {
        if (mode == 1)
        {
            for (int i = 0; i < Array.length; i++)
            {
                Array[i][i] = 0;
            }
        }
        else if (mode == 2)
        {
            for (int i = 0; i < Array.length; i++)
            {
                Array[Array.length-i][Array.length-i] = 0;
            }
        }
        else
        {
            for (int i = 0; i < Array.length; i++)
            {
                Array[i][i] = 0;
                Array[i][Array.length-1-i] = 0;
            }
        }
        return Array;
    }

    public static int findMax(int[][] Array)
    {
        int max = 0;
        for (int i = 0; i < Array.length; i++)
        {
            for (int j = 0; j < Array[0].length; j++)
            {
                if (max < Array[i][j]) max = Array[i][j];
            }
        }
        return max;
    }

    public static int sumofSecondrow(int[][] Array)
    {
        if (Array.length >= 2)
        {
            int sum = 0;
            for (int i = 0; i < Array[0].length; i++)
            {
                sum += Array[1][i];
            }
            return sum;
        }
        else return -1;
    }
}
