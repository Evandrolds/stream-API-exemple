package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Evandro
 */
public class Exemplo_Supplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Agora vai";
        
        // Gerando 3 mensagem que foi declarada no Supplier 
        List<String> listaMsg = Stream.generate(supplier).limit(3).collect(Collectors.toList());
        List<String> listaMsg2 = Stream.generate(()-> "Vai aque vai").limit(3).collect(Collectors.toList());
        listaMsg.forEach(System.out::println);
        listaMsg2.forEach(System.out::println);
    }
}
