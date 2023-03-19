import java.util.Objects;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public boolean equals(Object o){
        if ( this == o ) return true;
        if ( o == null ) return false;
        if(getClass() != o.getClass()) return false;
        Person p = (Person) o;
        return Objects.equals(name,p.name) && Objects.equals(age,p.age) && Objects.equals(address,p.address);
    }
    public int hashCode(){
        int result =1;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(age);
        result = 31 * result + Objects.hashCode(address);
        return result;
    }


}
