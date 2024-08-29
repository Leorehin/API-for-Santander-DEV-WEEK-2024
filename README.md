# API para o app Santander Dev Week 2024

O objetivo dessa aplicação é criar uma backend para o aplicativo do santander baseado na tela inicial que contem informacoes como conta, saldo e alguns banners de acordo com a imgame.

![image](https://github.com/user-attachments/assets/367da8be-37a7-49fb-b134-7aa0bb8da1de)


## Diagrama de classes

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Card card
        +Feature[] features
        +News[] news
    }
    
    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }
    
    class Card {
        +String number
        +float limit
    }
    
    class Feature {
        +String icon
        +String description
    }
    
    class News {
        +String icon
        +String description
    }
    
    User "1" *-->"1" Account
    User "1" *-->"1" Card
    User "1" *-->"N" Feature
    User "1" *-->"N" News
```

## Abstração

Com a imagem chegamos a esse diagrama de classes acima em que agora precisamos implementa-lo de forma a resgatar esses objetos de um banco de dados para exibir ao cliente em sua tela inicial.

## Tecnologias usadas

Neste projeto fizemos o projeto Gradle com seus recursos em um .yml na pasta respectiva. Dessa forma podemos implementar a aplicação quer fará a criação de um objeto conta e o recuperará através de seu ID definido na classe do objeto. O banco de dados utilizado nesse momento foi o H2 por ser um banco em memoria ideal para teste de aplicação no formato SQL com integração pela persistencia JPA do Java. Assim utilizamos o principio SOLID em nossa implementação do serviço, pois o codigo não fica exposto ao usuario caso ocorra algum erro ou algo parecido.

