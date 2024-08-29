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
```mermaid
