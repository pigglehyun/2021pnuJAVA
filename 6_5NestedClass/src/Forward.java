public class Forward extends  Player{
    private String type;
    public Forward(String name, int jerseyNumber, int speed, String type){
        super(name, jerseyNumber, speed+10,type);

    }
    public String getType(){
        return this.type;
    }

    protected  int getSpeed(){
        return(super.speed);
    }
}
