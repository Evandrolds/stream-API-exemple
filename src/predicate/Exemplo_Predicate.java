package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Evandro
 */
public class Exemplo_Predicate {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Java", "Javascript", "Angular", "Csharp", "Dotnete", "C#", "Ruby", "R", "C++");

        // Passando o predicate separadamente com a Lambda
        Predicate<String> predicate = x -> x.length()>=5;

        // Recebendo o predicate no parametro do filter e imprindo o resultado 
        nomes.stream().filter(predicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=========================");

        // Passando o predicate (lambda) direto no parametro do filter e imprindo o resultado
        nomes.stream().filter((x) -> x.startsWith("J"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
