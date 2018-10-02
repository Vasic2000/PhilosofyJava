package Glava_04.whileTest;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class WhileTest
{
    static boolean condition()
    {
        double ccc = Math.random();
        boolean result = ccc < 0.99;
        System.out.print(ccc + " < 0.99 = " + result + ", ");
        return result;
    }

    public static void main(String[] args)
    {
        while(condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
}
