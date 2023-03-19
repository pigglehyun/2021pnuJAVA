import java.util.Objects;

public class Professor extends Person{
    private String schoolName;
    private String major;

    public Professor(String name, int age, String address, String schoolName, String major){
        super(name, age, address);
        this.schoolName = schoolName;
        this.major = major ;
    }

    public void setMajor(String major){
        this.major = major;
    }
    public String toString(){
        return String.format("%s, %d, %s, %s, %s",getName(),getAge(),getAddress(),schoolName,major);
    }

    public boolean equals(Object o){
        if ( this == o ) return true;
        if ( o == null ) return false;
        if(getClass() != o.getClass()) return false;
        Professor p = (Professor) o;
        return Objects.equals(schoolName,p.schoolName) && Objects.equals(major,p.major) ;
    }
    public int hashCode(){
        int result =1;
        result = 31 * result + Objects.hashCode(schoolName);
        result = 31 * result + Objects.hashCode(major);
        return result;
    }
}
