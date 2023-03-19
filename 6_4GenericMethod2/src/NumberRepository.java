import java.util.ArrayList;
import java.util.List;

public class NumberRepository extends GenericMethodExtendsTest {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    //implement addAll() method
    public <T>void addAll(List<? extends Number> data){
        for (Number d : data)
            this.data.add(d);
    }

    public String toString(){
        return data.toString();

    }
}
