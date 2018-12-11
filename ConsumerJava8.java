
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;

/*
Consume property does nt have any return type jsut consumes the input argument
*/
public class ConsumerJava8{
    
    public static void main(String args[])
    {
        
        Consumer<String> consumer = c -> System.out.println(c);
        
        consumer.accept("omg");
        consumer.accept("chaitra");
        consumer.accept("chaitraaaaaaaaa");
        consumer.accept("chaitraaaaaaaaaaaaaaaa");
    }
    
}
