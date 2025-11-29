public class Main_m {
    public static void main(String[] args) {


        Animal a1 = new Animal();
        a1.makeSound();


        Dog d1 = new Dog();
        d1.makeSound();


        Animal a2 = new Dog();
        a2.makeSound();
    }
}