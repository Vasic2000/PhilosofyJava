package Glava_04.ifElse2;

public class IfElse2
{
    static int test(int testval1, int target)
    {
        return (testval1 > target) ? 1 : (testval1 < target) ? -1 : 0;
        //if(testval1 > target) return +1;
        //else if (testval1 < target) return -1;
        //else return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(test(10,5));
        System.out.println(test(5,10));
        System.out.println(test(5,5));
    }
}
