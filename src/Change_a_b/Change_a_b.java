package Change_a_b;

public class Change_a_b
{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //Замена местами переменных без использования третьей переменной

        System.out.println("A = " + a + " B = " + b);
        a=a+b;
        System.out.println("A = " + a + " B = " + b);
        b=a-b;
        System.out.println("A = " + a + " B = " + b);
        a=a-b;
        System.out.println("A = " + a + " B = " + b);

    }

}
