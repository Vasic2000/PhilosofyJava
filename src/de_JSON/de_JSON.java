package de_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;

public class de_JSON
{
    public static void main(String[] args) throws IOException
    {
        String jsonString = "{\"name\":\"Murka\",\"cats\":[{\"name\":\"Timka\"},{\"name\":\"Killer\"}]}";
        StringReader reader = new StringReader(jsonString);

        ObjectMapper mapper = new ObjectMapper();

        Cat cat = mapper.readValue(reader, Cat.class);
        System.out.println("Готово");
    }
}
