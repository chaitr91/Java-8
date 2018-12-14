import java.util.function.Supplier;
import java.lang.Math;

public class OTPGenerationSupplier{

     public static void main(String []args){
        Supplier<Integer> s = () -> {
            
            int rand = (int) (Math.random() * 9000)+1000;
            return rand;
            
        }; 
         
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        
     }
     
     
}
