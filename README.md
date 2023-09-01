## Exemplo de implementação do Stream API
A API de Stream (java.util.stream) em Java é uma parte poderosa da biblioteca de Streams introduzida no Java 8. Ela permite que você execute operações em coleções de dados de maneira mais concisa, legível e eficiente. O principal objetivo da API de Stream é permitir o processamento de sequências de elementos de forma funcional e declarativa.

Aqui estão alguns conceitos chave relacionados à API de Stream:

1. **Stream**: Um Stream representa uma sequência de elementos. Pode ser uma sequência de objetos em uma coleção (como uma lista ou um conjunto) ou até mesmo uma sequência de números inteiros. Streams podem ser usados para processar elementos de forma individual ou coletiva.

2. **Operações Intermediárias**: São operações que podem ser chamadas em um Stream para transformá-lo em outro Stream. Exemplos incluem `filter()`, `map()`, `distinct()`, `sorted()`, `limit()`, etc. Essas operações são lazy, o que significa que elas não são executadas até que uma operação terminal seja chamada.

3. **Operações Terminais**: São operações que produzem um resultado final ou um valor final. Exemplos incluem `forEach()`, `collect()`, `count()`, `reduce()`, `min()`, `max()`, etc. Quando uma operação terminal é chamada, ela gera o resultado ou realiza alguma ação no Stream.

4. **Lazy Evaluation**: Uma característica importante dos Streams é a avaliação preguiçosa (lazy evaluation). Isso significa que as operações intermediárias não são executadas até que uma operação terminal seja chamada. Isso permite que você economize recursos computacionais, evitando o processamento desnecessário de elementos.

Aqui está um exemplo simples de como usar a API de Stream:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filtrar os números pares e dobrá-los
List<Integer> numerosParesDobrados = numeros.stream()
    .filter(n -> n % 2 == 0)   // Operação intermediária
    .map(n -> n * 2)            // Operação intermediária
    .collect(Collectors.toList()); // Operação terminal
// Println comum
System.out.println(numerosParesDobrados); // SAÍDA: [4, 8, 12, 16, 20]
```

```java
 List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filtrar os números pares e dobrá-los
List<Integer> numerosParesDobrados = numeros.stream()
    .filter(n -> n % 2 == 0)   // Operação intermediária
    .map(n -> n * 2)            // Operação intermediária
    .collect(Collectors.toList()); // Operação terminal
    // Utilizando forEach com consumer
numerosParesDobrados.forEach(System.out::println);
```
Neste exemplo, usamos uma sequência de operações intermediárias para filtrar os números pares e, em seguida, dobrá-los. A operação terminal `collect()` coleta os resultados em uma lista.

A API de Stream torna o código mais legível e ajuda a evitar loops explícitos, melhorando a clareza e a manutenção do código. Além disso, permite que o Java realize otimizações internas para melhorar o desempenho.
#### Deixei no repositório exmplos mais claros de como implementar stream com outros métodos, tais como `BinaryOparatior()`, `Function`, `Consumer`, `Predicate()` e `Suplier()`.
Recomendo fortemente que consulte a documentação oficial, segue o link [Stream-API Documentation](https://www.oracle.com/br/technical-resources/articles/java-stream-api.html)
