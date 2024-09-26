# Por que o código original não implementa o Factory Method Pattern

No código original, a classe `XMLReaderFactory` tem um método estático (`createXMLReader`) que retorna uma instância de uma classe que implementa a interface `XMLReader`. No entanto, o Factory Method Pattern não é simplesmente sobre ter um método que cria objetos; ele envolve uma instância de classe, em vez de métodos estáticos, e a criação do objeto é delegada para subclasses, permitindo maior flexibilidade e extensibilidade.

No padrão Factory Method, a criação de objetos é delegada para métodos de fábrica definidos em classes específicas (geralmente em uma hierarquia de classes). O principal objetivo do Factory Method é permitir que subclasses decidam qual classe instanciar. O código fornecido não usa subclasses para a criação dos objetos, o que é um ponto fundamental do padrão.

## Problemas do código atual

- **Método estático**: O uso de um método estático não permite que subclasses substituam o comportamento de criação de objetos. No Factory Method, a criação de objetos é delegada a uma instância de uma classe, e não a um método estático.
- **Falta de extensibilidade**: O código não permite que novas implementações de `XMLReader` sejam introduzidas facilmente, uma vez que a lógica de criação está presa ao método estático.

## Modificação do código para implementar o Factory Method Pattern

Para implementar o padrão Factory Method, precisamos criar uma classe abstrata (ou interface) que declare o método de fábrica (`createXMLReader`). As subclasses concretas irão sobrescrever este método para criar instâncias específicas de `XMLReader`.

Aqui está uma modificação do código para seguir o padrão Factory Method: 

`Ver implementação nos arquivos deste diretório.`
### Explicação da implementação

- **XMLReaderFactory (Abstract Factory)**: Esta é uma classe abstrata que declara o método `createXMLReader()`, que deve ser implementado pelas subclasses concretas. Isso permite que subclasses decidam qual implementação de `XMLReader` será criada.

- **SAXReaderFactory e DOMReaderFactory (Concrete Factories)**: São subclasses concretas que sobrescrevem o método `createXMLReader()` para retornar instâncias específicas de `SAXReader` ou `DOMReader`.

- **XMLReader (Interface)**: A interface comum que define os métodos que as classes concretas devem implementar (`setContentHandler` e `parse`).

- **SAXReader e DOMReader (Concrete Products)**: Implementações concretas da interface `XMLReader`.

- **Client**: O cliente usa a fábrica abstrata para criar objetos `XMLReader` sem se preocupar com suas implementações concretas. O cliente pode escolher dinamicamente qual fábrica concreta usar.