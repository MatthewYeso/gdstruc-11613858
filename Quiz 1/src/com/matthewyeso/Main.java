package com.matthewyeso;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int array[] = {6, 7, 2, 1, 4};
        int size = array.length;

            for (int i = 0; i < size - 1; i++)
            {
                for (int j = 0; j < size - i - 1; j++)
                    if (array[j] < array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
            }
            System.out.println("Bubble Sorted Array:");
            System.out.println(Arrays.toString(array));

        int arrayb[] = {5, 7, 3, 2, 6};
        int sizeb = arrayb.length;

        for (int i = 0 ;i< sizeb-1; i++)
        {
            int min = i;
            for (int j = i+1; j< sizeb; j++)
            {
                if (arrayb[j] > arrayb[min])
                    {
                    min = j;
                    }
            }
            int temp = arrayb[min];
            arrayb[min] = arrayb[i];
            arrayb[i] = temp;
        }

        System.out.println("Selection Sorted Array:");
        System.out.println(Arrays.toString(arrayb));

    }
}


