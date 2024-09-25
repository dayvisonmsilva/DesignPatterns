### Problema: Processar Diferentes Tipos de Arquivo

Imagina que você precisa criar um sistema que vai lidar com vários tipos de arquivos, como CSV, XML e JSON, mas tem um detalhe: cada arquivo tem suas regras próprias para ser validado e processado. O desafio é que o processo geral de leitura desses arquivos é sempre o mesmo. Primeiro, você carrega o arquivo, depois verifica se ele está no formato correto (validação), extrai os dados importantes e, por fim, salva tudo no banco de dados.

O problema é que, para cada tipo de arquivo, algumas dessas etapas precisam ser feitas de formas diferentes. Se fôssemos programar sem pensar muito, acabaríamos copiando e colando muito código para cada tipo de arquivo, o que tornaria o código difícil de manter e repetitivo. Como podemos criar uma solução que reaproveite ao máximo o código, mas ainda permita que cada arquivo tenha seu processamento específico?

---

### Solução com Template Method

A ideia é usar o padrão de projeto **Template Method** para resolver isso. Esse padrão nos permite definir a estrutura básica do processo de manipulação de arquivos numa classe genérica, mas deixando as partes que variam para subclasses que tratam de cada tipo de arquivo (CSV, XML, JSON, etc.).

Com o Template Method, criamos uma **classe base** que define o esqueleto do processo, como carregar o arquivo e salvar os dados, e deixamos os detalhes, como validação e extração de dados, para as subclasses. Dessa forma, evitamos repetir código e mantemos tudo organizado.

Em resumo, o Template Method vai ser nossa "receita", e cada tipo de arquivo vai ter sua forma de preparar alguns ingredientes, mas o fluxo geral vai ser sempre o mesmo.