package binaryOpartion;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author Evandro
 */
public class Exemplo_BynaryOpartion {

    public static void main(String[] args) {

        List<Integer> soma = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Somando valores com BinaryOperation
        BinaryOperator<Integer> somaBinary = (number1, number2) -> number1 + number2;
        System.out.println("Exemplo 1");
        // Passando o BinaryOperation no parametro do Reduce como é pedido
        int resultSoma = soma.stream().reduce(0, somaBinary);
        System.out.println(resultSoma);

        // Passando o Lambda do tipo BinaryOperation como é pedido no parametro do reduce
        // multiplicando os valores da lista
        System.out.println("Exemplo 2 ===============");
        int value = soma.stream().reduce(1, (numero1, numero2) -> numero1 * numero2);
        System.out.println("Value: " + value);

        // Utilizando o Reference Method no parametro do reduce, pegando o maior valor da lista
        System.out.println("Exemplo 3 ===============");
        System.out.println(soma.stream().reduce(0, Integer::max));
    }
}
