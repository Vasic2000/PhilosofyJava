package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Jaxb_Zoo {
    public static void main(String[] args) throws JAXBException
{
    //создание объектов Cat&Zoo для сериализации в XML
    Cat2 catic = new Cat2();
    catic.name = "Maria";
    catic.age = 2;
    catic.weight = 11;

    Zoo zoo = new Zoo();
    zoo.animals.add(catic);
    zoo.animals.add(catic);

    //писать результат сериализации будем во Writer(StringWriter)
    StringWriter writer = new StringWriter();

    //создание объекта Marshaller, который выполняет сериализацию
    JAXBContext context = JAXBContext.newInstance(Cat.class, Zoo.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    // самосериализация
    marshaller.marshal(zoo, writer);

    //преобразовываем все записанное в StringWriter в строку
    System.out.println(writer.toString());
}
}
