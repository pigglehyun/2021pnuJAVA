import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private List<Object> data = new ArrayList<>();
    private static DataRepository instance = new DataRepository();
    public static DataRepository getInstance() {
        return instance;
    }
    public void add(Object data) {
        this.data.add(data);
    }
    public <T> List<T> getData(Class<T> templateClass) {

        int index = 0;
        List<T> newData = new ArrayList<>();

        for(Object e : this.data){
            if(templateClass.isInstance(e)){
                newData.add((T)e);
            }
        }

        System.out.println(newData);
        System.out.println(templateClass);
        System.out.println(this.data);



        return newData;

    }
}
