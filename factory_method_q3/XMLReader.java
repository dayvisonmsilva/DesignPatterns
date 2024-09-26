package factory_method_q3;

import java.io.InputStream;
import org.xml.sax.ContentHandler;

// Interface XMLReader
public interface XMLReader {
    void setContentHandler(ContentHandler handler);
    void parse(InputStream is);
}