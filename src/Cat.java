public class Cat extends Pet {
    private String nameOfTheBreed;
    public Cat(String name, int age, String breed){
        super(name, age);
        this.nameOfTheBreed = breed;
    }
    public String getNameOfTheBreed(){
        return nameOfTheBreed;
    }
    public void setNameOfTheBreed(String breed){
        this.nameOfTheBreed = breed;
    }
    public static void main(String[] agrs){
        Cat myCat = new Cat("Tom", 5, "Persian");
        System.out.println("Name:" + myCat.getName() );
        System.out.println("Age:" + myCat.getAge());
        System.out.println("Breed:" + myCat.getNameOfTheBreed());

        myCat.setNameOfTheBreed("Bobtail");
        System.out.println("Updated Breed" + myCat.getNameOfTheBreed());
    }
}
