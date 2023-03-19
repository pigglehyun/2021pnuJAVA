package edu.pnu.admin;

import edu.pnu.collection.GenericList;

import java.util.Objects;

public class School {
    private final String name;

    private GenericList<Student> students = new GenericList<Student>();

    private int limit;
    private int studentCount = 0;


    public School(){
        this.name = null;
        this.limit = 0;
    }
    public School(String name, int limit){
        this.name = name;
        this.limit = limit;
    }

    public Student findStudent(String name,int year){
        return students.find(name, year);
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
        studentCount++;

    }
    public void removeAllStudent(){
        students.clear();
        studentCount=0;
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
    public String toString(){
        String msg = " School Name: " + name + " Student Count: "+ studentCount+"\n";
        msg +=  "\t" +students + "\n";



        return msg;
    }
    // equals
    //hasCode
}
