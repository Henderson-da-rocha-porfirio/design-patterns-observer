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
#### 8. Esse padrão, desacopla o observado do observador. O observado ao mudar, ele vai pedir para notificar. Ele não se preocupa com quem está observando. Ele só sabe que tem uma lista que ele tem que `iterar`[¹](https://github.com/Henderson-da-rocha-porfirio/design-patterns-observer#-iterar) em todo mundo da lista e mandar uma notificação. Isso permite que você posso "plugar" e "desplugar", a qualquer momento, os observadores sem que isso afete o objeto observado.
#### 9. Ele provoca a separação dos conceitos e do código também ( porque isso não gera dependência ).

## Notas

## ¹ Iterar:
- Iteração é o processo chamado na programação de repetição de uma ou mais ações. É importante salientar que cada iteração se refere a apenas uma instância da ação, ou seja, cada repetição possui uma ou mais iterações. Comando `“for”`: Em suma, para entender o que é interação é necessário conhecer alguns dos seus elementos. Nesse sentido, já falamos acima o que é “for” e “while”, mas é importante observar mais alguns detalhes sobre estes elementos. Portanto, o comando “for” processa cada item em uma lista, sempre por comandos já conhecidos. Ele é mais usado quando já se conhece de antemão o número de iterações necessárias. Comando `“while”`: Enquanto isso, o while fornece um comando muito mais geral, utilizando uma expressão booleana para controlar o fluxo de execução. Nesse sentido, podemos criar qualquer tipo de iteração em while, sendo que esse método exige mais atenção por parte do developer, que tem que fornecer um valor inicial, criar uma condição de saída e acompanhar a execução. Dessa forma, é preciso analisar qual dos dois utilizar no seu fluxo de trabalho que exija iteração.
