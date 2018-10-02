package Glava_02.hellowDate;
import java.util.Date;


// HellowDate.java
public class HellowDate
{
    public static void main(String[] args)
    {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());

        System.out.println(System.getProperty("user.name"));
    }
}

