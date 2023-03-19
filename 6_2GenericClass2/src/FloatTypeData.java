public class FloatTypeData extends SpecificTypeData <Float>{

    private Object floattype = new Object [0];
    public FloatTypeData( float a){
        super(a);

    }
    @Override
    public void addData(Float data) {
        float newdata = data + this.getData();
        this.data = newdata;

    }
}
