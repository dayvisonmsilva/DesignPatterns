package factory_method_q3;

import java.io.InputStream;

// Fábrica abstrata
public abstract class XMLReaderFactory {
    // Método Factory que será implementado pelas subclasses
    public abstract XMLReader createXMLReader();

    // Método para obter uma instância de XMLReader e utilizá-la
    public void parseXML(InputStream is) {
        XMLReader reader = createXMLReader(); // Criação delegada às subclasses
        reader.parse(is);
    }
}