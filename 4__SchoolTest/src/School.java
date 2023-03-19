import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class School {
    private String name;
    private int limit;
    private Student[] students;
    private int studentCount = 0;
    public String toString(){
        String msg = "School Name: " + name + " Student Count: "+ studentCount+"\n";
        for(int i = 0 ; i < studentCount ; i++){
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }

    public School(String name, int limit){
        this.name = name;
        this.limit = limit;
    }

    public Student findStudent(String name,int year){
         int b = 0;
        for(int i = 0 ; i < studentCount ; i++){
            if (( students[i].getName() == name )&& (students[i].getYear() == year)){
                b = i;
                break;
                }
            else{
                System.out.println("Student Not Found with name "+name+" and year "+year);
            }
        }
        return students[b];
    }

    public void addStudent(Student newStudent){
        students[studentCount] = new Student(" ", 0) ;
        students[studentCount] = newStudent;
        studentCount++;

    }
    public void removeAllStudent(){
        studentCount = 0;
        students = null;
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass())return false;
        School other = (School) o;
        return (Objects.equals(name,other.name) && Objects.equals(limit,other.limit)  );
    }
    public int hasCode(){
        int result = 1;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(limit);
        return result;
    }

    // equals
    //hasCode
}
