# Observer
### 1. É para ser usado em situações que você tem observadores e observados.
### 2. Uma série de observadores estão interessados em alguém, e esse, seria o observado. E quando esse tivesse uma mudança, todos os observadores precisam ser notificados dessa mudança.
### 3. Uma ideia mais real do conceito desse padrão, é um sistema de marcação de consulta médica. Onde as pessoas ficam na espera de surgir alguma vaga ( observadores ) na agenda ( observado ) do médico no sistema para consulta.
### 4. Em nível de conceito seria: Observer ( o observador ) e o Subject ( o observado ).
### 5. O Subject tem operações para:
#### a. Registrar o observador.
#### b. Remover o registro do observador.
#### c. E notificar os observadores. Para isso é necessário manter uma lista de quem vai estar interessado nessa mudança de status ou eventos que serão disparados.
### 6. O Observer tem operação de:
#### a. Update. É a operação que vai ser chamada no momento da notificação.
### 7. Tanto o Observer quanto o Subject são implementados como interfaces ou classes abstratas por isso possuem:
#### a. Subject: tem como classes concretas as ObservadasConcreta.
#### b. Observer: tem como classes concretas as ObservadoraConcreta.
#### c. Elas são as classes concretas que vão resultar em objetos tanto de subjects quanto de observers.
#### 8. Esse padrão, desacopla o observado do observador. O observado ao mudar, ele vai pedir para notificar. Ele não se preocupa com quem está observando. Ele só sabe que tem uma lista que ele tem que iterar em todo mundo da lista e mandar uma notificação. Isso permite que você posso "plugar" e "desplugar", a qualquer momento, os observadores sem que isso afete o objeto observado.
#### 9. Ele provoca a separação dos conceitos e do código também ( porque isso não gera dependência ).