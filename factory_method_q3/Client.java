package factory_method_q3;

// Exemplo de uso
public class Client {
    public static void main(String[] args) {
        // Escolhe a fábrica com base em uma lógica de configuração
        XMLReaderFactory factory = new SAXReaderFactory(); // ou new DOMReaderFactory();
        
        // Agora o cliente pode usar o método sem se preocupar com a classe concreta
        factory.parseXML(System.in);
    }
}