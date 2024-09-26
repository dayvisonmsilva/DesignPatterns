# Cenários e Exemplos Práticos do Padrão Adapter

Aqui estão alguns cenários e exemplos práticos de quando o padrão Adapter é preferível:

## 1. Integração com Bibliotecas de Terceiros

Imagine que você está desenvolvendo um sistema que utiliza uma biblioteca de terceiros que possui uma interface diferente daquela que seu sistema espera. Em vez de alterar toda a lógica do seu sistema ou modificar a biblioteca (o que geralmente não é possível), você pode criar um Adapter que faz a conversão entre a interface do seu sistema e a da biblioteca externa.

**Exemplo:** Você tem uma biblioteca que trabalha com leitura de arquivos XML, mas seu sistema utiliza JSON. Ao invés de modificar seu sistema ou a biblioteca, você pode criar um Adapter que converte XML em JSON.

## 2. Compatibilização com Código Legado

Ao manter sistemas legados, pode ser necessário integrar novas funcionalidades, mas o código antigo pode não seguir os padrões modernos. O Adapter permite que você adicione novas funcionalidades sem alterar o código legado, o que pode ser arriscado ou custoso.

**Exemplo:** Um sistema financeiro antigo que ainda usa uma interface para processamento de pagamentos via cheques precisa agora processar pagamentos via cartão de crédito. O Adapter poderia mapear a interface antiga para o novo método de processamento de pagamentos.

## 3. Reuso de Componentes

Quando você deseja reutilizar uma classe existente, mas a interface não corresponde àquela que você precisa no seu novo sistema, o Adapter é ideal para evitar duplicação de código.

**Exemplo:** Uma aplicação de gráficos pode ter diferentes tipos de gráficos (barras, pizza, linhas), e cada um deles pode ser desenvolvido por diferentes equipes. Se as interfaces forem diferentes, você pode criar um Adapter para padronizar a interface de todos os tipos de gráficos, permitindo que seu sistema os trate de maneira uniforme.

## 4. Trabalhar com APIs Incompatíveis

Se você estiver trabalhando com várias APIs de diferentes fornecedores ou serviços, o Adapter pode converter a interface de cada API para uma interface comum que seu sistema entenda.

**Exemplo:** Um serviço que consome dados meteorológicos de várias APIs diferentes (API A retorna em Celsius, API B em Fahrenheit) pode usar o Adapter para padronizar os dados recebidos e converter para um formato único (por exemplo, tudo em Celsius).

# Diferença em Relação a Outros Padrões Estruturais

- **Facade:** O padrão Facade simplifica a interface de um subsistema, enquanto o Adapter converte uma interface existente em uma interface esperada. O Adapter seria mais apropriado se você precisar trabalhar com uma interface que não pode ser modificada, enquanto o Facade é ideal quando você precisa simplificar várias interfaces complexas sem alterar o comportamento subjacente.

- **Decorator:** O Decorator adiciona comportamento extra sem alterar a interface da classe, enquanto o Adapter modifica a interface sem necessariamente mudar o comportamento. Use o Adapter se precisar de compatibilidade de interface, mas se a interface for correta e você apenas deseja adicionar funcionalidades, o Decorator é preferível.

- **Bridge:** O Bridge separa a abstração da implementação, enquanto o Adapter foca em compatibilizar interfaces. O Adapter é preferível se você tiver que lidar com classes existentes com interfaces incompatíveis, enquanto o Bridge é mais apropriado para sistemas onde a abstração e a implementação podem variar separadamente.

# Cenário

Suponha que você tenha um sistema que precisa enviar mensagens, mas usa diferentes tipos de serviços de mensagem. Vamos usar um serviço de email e um serviço de SMS. O serviço de email já está implementado e não pode ser modificado, mas queremos integrá-lo a um sistema que espera um formato diferente.

# Comparação

- **Adapter:** O MessageAdapter permite que o EmailSender funcione como um MessageSender sem alterar a implementação original do serviço de email. É útil quando precisamos adaptar uma interface existente para uma nova interface esperada.

- **Facade:** A MessageService fornece uma interface simplificada para o envio de mensagens, agrupando a funcionalidade de múltiplos serviços em um único ponto de acesso. É útil quando queremos simplificar a interação com um sistema complexo, escondendo detalhes de implementação.
