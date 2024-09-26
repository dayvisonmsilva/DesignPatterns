# Facade - Structural (Estrutural)

## Intenção

*O padrão de projeto **Facade** (Fachada) é um padrão estrutural que tem como objetivo simplificar o uso de um conjunto de interfaces dentro de um subsistema. Ele cria uma interface mais simples e de nível superior, facilitando a interação com o subsistema e tornando seu uso mais acessível e intuitivo.*

---

## Sobre o Facade

O padrão **Facade** simplifica o código cliente, criando uma interface unificada para sistemas complexos. Em vez de o cliente precisar instanciar várias classes e chamar diversos métodos, o Facade oferece uma interface simples para acessar funcionalidades necessárias. Ele atua como um intermediário, similar a um atendente em um call center, direcionando o cliente ao setor correto, sem esconder a complexidade do sistema.

Embora facilite o uso, o Facade pode acabar concentrando muitas responsabilidades em uma só classe, criando uma "God Class". Para evitar isso, é possível criar várias fachadas para manter o design mais organizado.

---

## Estrutura

Veja a pasta diagrama.

## Aplicabilidade

Use o padrão Façade quando:

- você quer disponibilizar uma interface mais simples para um sistema complexo
- você quer criar pontos de entrada para determinadas partes do sistema, como serviços externos, camadas da aplicação e objetos complexos dentro em determinadas partes do código  

## Implementação exemplo
- **Meal**: Representa o produto final, que é uma refeição. Pode conter vários itens e calcular o preço total.

- **MealBuilder Interface**: Define os métodos para construir refeições e obter o resultado final.

- **MainDishBuilder e VeganDishBuilder**: Classes concretas que implementam a interface `MealBuilder`, cada uma responsável por construir um tipo específico de refeição.

- **BuilderFacade**: É a classe **Facade**, que expõe métodos simples (`makeMeal1()`, `makeMeal2()`, `makeMeal3()`) para construir refeições, escondendo a complexidade de manipular os builders diretamente.

- **Main**: Ponto de entrada do programa, demonstrando o uso do **Facade** para simplificar a criação de refeições.