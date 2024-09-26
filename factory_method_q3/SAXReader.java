package factory_method_q3;

import java.io.InputStream;
import org.xml.sax.ContentHandler;

// Classe concreta 1: SAXReader
public class SAXReader implements XMLReader {
    @Override
    public void setContentHandler(ContentHandler handler) {
        // Implementação específica para SAXReader
    }

    @Override
    public void parse(InputStream is) {
        // Implementação específica para SAXReader
        System.out.println("Parsing using SAXReader");
    }
}