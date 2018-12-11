
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Function;

public class FunctionChainingJava8{
    
    
    public static void main (String args[]) {
        
        List<String> strList = Arrays.asList("cxbhbjwb","bwhbd","bdhbejh","ebjenhjerkh");
        Function<String,String> f1 = i ->{
        return i.substring(0,3);
        };
    
        Function<String,String> f2 = i ->{
            char start = Character.toUpperCase(i.charAt(0));
            return  start + i.substring(1,3);
        };
        
        Function<String,String> f3 = i -> {
            return i.endsWith("h") ? i : "GODZILLA";
            
        }; 
    
    
       System.out.println("andThen function");
       
       // andthen first f1 followed by f2
        List<String> resList = new ArrayList<String>();
        for(String s: strList){
            resList.add(f1.andThen(f2).apply(s));
        }
        resList.forEach(i-> System.out.println(i));
        
        
        System.out.println("Compose function");
        
        // compose f3 followed by f1.
        List<String> resuList = new ArrayList<String>();
        for(String s: strList){
            resuList.add(f2.compose(f3).apply(s));
        }
        resuList.forEach(i-> System.out.println(i));
        
    
    }  
    
}
