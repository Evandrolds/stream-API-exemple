package consumer;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class Exemplo_Consumer {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Lambda sem filtro com stream, pegando numeros pares
        number.stream().forEach((x) -> {
            if (x % 2 == 0) {
                System.out.println(x + " = Par");
            } 
        });
        //Lambda sem filtro sem stream, pegando numeros pares
        number.forEach((x) -> {
            if (x % 2 == 0) {
                System.out.println(x + " = Par");
            }
        });

        // Lambida com strean,filtro e conumer, pegando numeros pares
        number.stream().filter((x) -> x % 2 == 0).forEach(System.out::println);
    }
}
