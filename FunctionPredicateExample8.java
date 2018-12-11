import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FunctionPredicateExample8{

     public static void main(String []args){
        List<Employee> al = populate();
        
        Function<List<Employee>,Double> f = fo -> {
            double total = 0.0;
            for(Employee e : fo){
                total += e.salary;
            }
             return total;
        };
       
       System.out.println("Total Salary of all employees: " +f.apply(al));
      
       Predicate<Employee> p = pi -> pi.salary < 3000;
       
       for(Employee e: al ){
           if(p.test(e)){
               System.out.println(e.toString());
           }
       }
       
     
     
     List<Employee> employeeListLessThan3k = al.stream().filter(e->e.salary < 3000).collect(Collectors.toList());
     employeeListLessThan3k.forEach(i -> System.out.println(i.toString()));
     
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
    
    @Override
    public String toString(){
        return "Employee:"+this.name+" Salary:"+this.salary;
    }
}
