package StringReader;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.Reader;

public class Readers
{
    public static void main (String[] args) throws Exception
    {
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";

        //это строчка – ключевая: мы «превратили» строку в Reader
        StringReader reader = new StringReader(test);

        executor(reader);
    }

    public static void executor(Reader reader) throws Exception
    {
        BufferedReader br = new BufferedReader(reader);
        String line;
        while((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
    }
}
