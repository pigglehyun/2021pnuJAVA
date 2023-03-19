public class Person implements MyMovable{
    private String moveBy;

    public Person(String moveBy){
        this.moveBy = moveBy;
    }



    public String moveBy(){
        return "나는 "+moveBy+"로 출근한다.";
    }
}
