package template.src;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        FileProcessor csvProcessor = new CSVFileProcessor();
        csvProcessor.processFile("flamengo.csv");

        System.out.println();
        FileProcessor xmlProcessor = new XMLFileProcessor();
        xmlProcessor.processFile("vasco.xml");
    }
}

