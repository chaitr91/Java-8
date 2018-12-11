import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;


public class FunctionExample8{

     public static void main(String []args){
        List<Employee> al = populate();
        
        Function<List<Employee>,Double> f = fo -> {
            double total = 0.0;
            for(Employee e : fo){
                total += e.salary;
            }
             return total;
        };
       
       System.out.println("Total Salary " +f.apply(al));
     }
     
     public static List<Employee> populate(){
         List<Employee> ae = new ArrayList<Employee>();
         ae.add(new Employee("X",2000));
         ae.add(new Employee("XY",1000));
         ae.add(new Employee("ZY",3000));
         ae.add(new Employee("RY",4000));   
        return ae;
     }
}


class Employee{
    double salary;
    String name;
    
    public Employee( String name, double salary){
        this.salary = salary;
        this.name = name;
    }
}
