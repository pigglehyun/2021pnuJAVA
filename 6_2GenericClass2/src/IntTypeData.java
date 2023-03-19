public class IntTypeData extends SpecificTypeData<Integer>{
    private int a;
    private int b;
    private Object inttype = new Object [0];

    public IntTypeData(int a){
        super(a);

    }

    @Override
    public void addData(Integer data) {
        int newdata = data + this.getData();
        this.data = newdata;

    }
}
