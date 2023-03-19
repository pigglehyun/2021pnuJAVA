package edu.pnu.collection;

import edu.pnu.admin.School;
import edu.pnu.admin.Student;

import java.util.Objects;

public class GenericList <T>{
    private static final int DEFAULT_SIZE = 10;
    private Object[] data = new Object[10];
    private int size =0 ;

    public GenericList(){
        Object[] data = new Object[10];
    }

    public void add(T student){
        this.data[size] = student;
        size++;
    }

    int a = 0;
    public Student find(String name, int year){

        Student s = new Student(name, year);
        int i = 0;
        for( ; i < size ; i++) {
            if (Objects.equals(s, this.data[i])) {
                a = i;
                break;
            }
        }
        if( i == size)
            data[a] = null;

        return (Student) data[a];

    }
    public void clear(){
        for( int i = 0 ; i < size ; i++)
            data[i] = null;
        size = 0;
    }

    public T get(int size){
        return (T) this.data[size];
    }

    public String toString(){
        String msg = "\n";
        for (int i = 0 ; i < size ; i ++){
            msg += this.data[i].toString() + "\n";
        }
        return msg;
    }
}
