package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Evandro
 */
public class Exemplo_Function {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Multiplicando valores em um function com lambda
        Function<Integer, Integer> function = value -> value * 2;

        // Multiplicando valor de uma function com lambda
        // Passando a function no parametro do Map
        List<Integer> multiplicarValor = number.stream().map(function).collect(Collectors.toList());
        multiplicarValor.forEach(System.out::println);

        System.out.println("==========================");

        // Multiplicando valor de uma function com lambda
        // Passando a lambda direto no parametro do Map
        multiplicarValor.stream().map(x -> x * 2).collect(Collectors.toList());
        multiplicarValor.forEach(System.out::println);
    }
}
