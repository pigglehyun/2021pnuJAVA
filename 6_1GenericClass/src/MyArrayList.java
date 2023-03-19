import java.lang.module.FindException;

public class MyArrayList<T> {
    private int index;
    private int capacity;
    private Object[] data;


    public MyArrayList(int capacity){
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public void add( T data ){
        this.data[index++] = data;
    }

    public T get(int index){
        return (T)this.data[index];
    }


}
