# Santander Dev Week 2023

JAVA RESTful API criada para Santander Dev Week 2023

## Diagrama de classes

```mermaid
classDiagram
    class User {
        <<Entity>>
        -String name
        -Account account
        -List<Feature> features
        -Card card
        -List<News> news
    }
    class Account {
        <<Entity>>
        -String number
        -String agency
        -double balance
        -double limit
    }
    class Feature {
        <<Entity>>
        -String icon
        -String description
    }
    class Card {
        <<Entity>>
        -String number
        -double limit
    }
    class News {
        <<Entity>>
        -String icon
        -String description
    }
    User o-- Account
    User o-- Feature
    User o-- Card
    User o-- News
```
