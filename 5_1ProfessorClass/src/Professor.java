public class Professor extends Person{
    private String schoolName;
    private String major;

    public Professor(String name, int age, String address, String schoolName, String major){
        super(name, age, address);
        this.schoolName = schoolName;
        this.major = major ;
    }

    public void increaseAge(){
        int ageup = getAge();
        setAge(ageup+1) ;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String toString(){
        return String.format("%s, %d, %s, %s, %s",getName(),getAge(),getAddress(),schoolName,major);
    }
}
