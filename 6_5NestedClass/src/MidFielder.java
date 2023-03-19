import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class MidFielder extends  Player{
    private String type;

    public MidFielder(String name, int jerseyNumber, int speed, String type){
        super(name, jerseyNumber, speed,type);

    }
    public String getType(){
        return this.type;
    }


    protected  int getSpeed(){
        return(super.speed);
    }
}
