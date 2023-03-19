import java.util.Objects;

public class Employee {
    private final String name ;
    private final Double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }
    public Double getSalary(){
        return this.salary;
    }
    public String toString(){
        return this.name + " " + this.salary;
    }
    public boolean equals(Object o){
        if ( this == o ) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Employee other = (Employee) o;
        return (Objects.equals(name, other.name) && Objects.equals(salary, other.salary)) ;
    }
    public int hashCode(){
        int result =1;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Double.hashCode(salary);
        return result;
    }
}
