package Glava_02.urshift;

import java.util.Random;

public class BitManipulation
{
    public static void main(String[] args)
    {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();

        printBinaryInt("-1", -1);
        printBinaryInt("+1", 1);

        int maxPos = 2147483647;
        int minPos = -2147483648;

        printBinaryInt("Макс. положительное.", maxPos);
        printBinaryInt("Макс. отрицательное.", minPos);

        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("j | j", i | j);



    }

    static void printBinaryInt(String s, int i)
    {
        System.out.println(s + " , int: " + i + " , двоичное: \n " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l)
    {
        System.out.println(s + " , int: " + l + " , двоичное: \n " + Long.toBinaryString(l));
    }
}
