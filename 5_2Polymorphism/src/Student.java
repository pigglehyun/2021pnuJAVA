import java.util.Objects;

public class Student extends Person{
    private String schoolName;
    private Grade grade = new Grade(1);

    public Student(String name, int age , String address, String schoolName){
        super(name,age,address);
        this.schoolName = schoolName;
    }

    public String getSchoolName(){
        return schoolName;
    }
    public Grade getGrade(){
        return this.grade;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public void upGrade(){
        grade.upGrade();
    }

    public boolean equals(Object o){
        if ( this == o ) return true;
        if ( o == null ) return false;
        if(getClass() != o.getClass()) return false;
        Student p = (Student) o;
        return Objects.equals(schoolName,p.schoolName) ;
    }
    public int hashCode(){
        int result =1;
        result = 31 * result + Objects.hashCode(schoolName);
        result = 31 * result + Objects.hashCode(grade);
        return result;
    }
}
