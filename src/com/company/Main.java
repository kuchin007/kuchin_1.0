package com.company;

public class Main
{

    public static void main(String[] args)

    {
        // 1.3

        int array[];
        array = new int[10];

        for (int i = 0; i < 10; ++i)
        {
            array[i] = i;
            System.out.println(array[i]);
        }
        // 1.4
        System.out.println(' ');
        for (String str : args)
        {
            System.out.println("аргумент = " + str);
        }
        // 1.5
        System.out.println(' ');
        float gr = 0.0f;
        System.out.println(' ');
        for (int i = 1; i < 11; ++i)
        {
            gr = (float)1/i;
            System.out.println(gr);
        }
        // 1.6
        System.out.println(' ');
        int a = 0;
        int b = 100;
        int r = 0;
        int array_random[];
        array_random = new int[10];
        int array_sort[];
        array_sort = new int[10];
        for (int i = 0; i < 10; ++i)
        {
            array_random[i] = (int)( Math.random() * (b-a) ) + a;
            array_sort[i] = array_random[i];
            System.out.println(array_random[i]);
        }
        int n = 0;
        for (int i = 0; i < 10; ++ i)
        {
            for (int j = 0; j < 10; ++j)
            {
                if (array_sort[j] > array_sort[i])
                {
                    n = array_sort[j];
                    array_sort[j] = array_sort[i];
                    array_sort[i] = n;
                }
            }

        }
        System.out.println(' ');
        for (int i = 0; i < 10; ++i)
        {
            System.out.println(array_sort[i]);
        }
        // 1.7
        System.out.println(' ');
        int z = 5;
        factorialCalc(z);

    }



    public static void factorialCalc(int k)
    {


       for (int i = 1; i < k; i++)
       {
           k = (k * i);
       }
        System.out.println(k);
    }

}
