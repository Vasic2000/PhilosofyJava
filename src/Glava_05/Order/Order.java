package Glava_05.Order;

public class Order
{
    static void f(String s, int i)
    {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s)
    {
        System.out.println("Int: " + i + ", string: " + s);
    }

    public static void main(String[] args)
    {
        f("Сначала строка", 11);
        f(99, "Сначала число");
    }
}
