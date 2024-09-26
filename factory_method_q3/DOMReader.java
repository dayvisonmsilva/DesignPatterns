package factory_method_q3;

import java.io.InputStream;
import org.xml.sax.ContentHandler;

// Classe concreta 2: DOMReader
public class DOMReader implements XMLReader {
    @Override
    public void setContentHandler(ContentHandler handler) {
        // Implementação específica para DOMReader
    }

    @Override
    public void parse(InputStream is) {
        // Implementação específica para DOMReader
        System.out.println("Parsing using DOMReader");
    }
}