public class Person{
    private String name;
    private String dob;
    public Person(String n){
        name = n;
        dob = "Not set";
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    public void setDoB(String newDob){
        dob = newDob;
    }
}