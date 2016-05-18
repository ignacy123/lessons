package lesson23;

import com.sun.xml.internal.fastinfoset.stax.events.StartElementEvent;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignacy on 14.01.16.
 */
public class ReadingXML {
    public static void main(String[] args) throws XMLStreamException {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("lesson23/books.xml");
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = factory.createXMLEventReader(inputStream);
        List<Book> books = new ArrayList<>();
        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();
            if (event.isStartElement()) {
                StartElementEvent startElementEvent = (StartElementEvent) event;
                startElementEvent.getName();
                if ("book".equals(startElementEvent.getName().toString())) {
                    readBook(eventReader);
                }
            }
        }
    }

    private static Book readBook(XMLEventReader eventReader) throws XMLStreamException {
        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();
            if(event.isEndElement()){

            }

        }
        return null;
    }


    }
