public abstract class Player {
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    private String type;

    public Player() {
    }

    public Player(String name, int jerseyNumber, int speed,String type) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.speed = speed;
        this.type = type;
    }


    public static class Builder{
        private String type ;
        private String name ;
        private int jerseyNumber ;
        protected int speed ;


        public Builder setPlayerType(String type) {
            this.type = type;
            return this;
        }
        public String getType(){
            return this.type;
        }


        public Builder setName(String name){
               this.name = name;
               return  this;
        }
        public Builder setJerseyNumber(int i){
            this.jerseyNumber = i;
            return this;
        }
        public Builder setSpeed(int i){
            this.speed = i;
            return this;
        }
        public Player build(){
            if(this.type == "forward"){
                Forward forward = new Forward(this.name, this.jerseyNumber,this.speed,this.type);
                return forward;
            }
            else if(this.type == "midfielder"){
                MidFielder midFielder = new MidFielder(this.name, this.jerseyNumber,this.speed,this.type);
                return midFielder;
            }
            else if(this.type == "defender"){
                Defender defender = new Defender(this.name, this.jerseyNumber,this.speed,this.type);
                return defender;
            }
            else
                return null;
        }
    }

    public String getName(){
        return this.name;
    }
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }



    public Player(Builder builder){
        this.name = builder.name;
        this.jerseyNumber = builder.jerseyNumber;
        this.speed = builder.speed;
        this.type = builder.type;
    }
    // Builder 클래스를 정의하시오. (단, static nested class 로 정의하시오.  )
    protected abstract int getSpeed() ;
    public static Builder Builder() {
        return new Builder();
    }

    public String toString(){
        return ("Player Name ='"+this.name+", JerseyNumber="+jerseyNumber+
                ", SPEED="+this.speed+", "+ this.type );
    }
}
