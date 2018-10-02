package Glava_02.literals;

public class Literals
{
    public static void main(String[] args)
    {
        int i1 = 0x2f; //Шестнадцатиричное (нижний регистр)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F; //Шестнадцатиричное (верхний регистр)
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177; //Восьмиричное (начинается с нуля)
        System.out.println("i3: " + Integer.toBinaryString(i3));

    }
}
