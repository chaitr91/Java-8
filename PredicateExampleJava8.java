import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/*
Removing all null and empty list words from the list
*/
public class PredicateExampleJava8{

     public static void main(String []args){
        List<String> strList = Arrays.asList("abc",null,"","def",null); 
        List<String> resList = new ArrayList<String>();
        final Predicate<String> pr = str -> (str==null || str.length()==0) ;
        for(String str: strList){
            if(!pr.test(str))
                resList.add(str);
        }
        
        
        resList.stream().forEach(s-> System.out.println(s.toString()));
     }
}
