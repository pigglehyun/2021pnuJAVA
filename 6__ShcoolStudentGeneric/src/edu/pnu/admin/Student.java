package edu.pnu.admin;



import java.util.Objects;

public class Student{

    private String name;
    private int year;
    private final School theSchool = new School();

    public Student(){}
    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public void setName(String name){ this.name = name ;}
    public void setYear(int year){this.year = year;   }
    public String toString(){
        return "\t[ "+this.name + ", " + this.year+"학년 ]";
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass())return false;
        Student other = (Student) o;
        return (Objects.equals(name,other.name) && Objects.equals(year,other.year)  );
    }
    public int hasCode(){
        int result = 1;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(year);
        return result;
    }
    //toString
    //equals
    //hashcode
}
