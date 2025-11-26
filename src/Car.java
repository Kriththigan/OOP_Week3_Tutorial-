public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String brand, int year, int doors){
        super(brand, year);
        this.numberOfDoors = doors;
    }
    public int getNumberOdDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int doors){
        this.numberOfDoors = doors;
    }
    public static void main(String[] args){
        Car myCar = new Car("Toyota", 2020, 4);
        System.out.println("Brand:" + myCar.getBrand());
        System.out.println("Year:" + myCar.getYear());

        System.out.println("Doors:" + myCar.getNumberOdDoors());

        myCar.setNumberOfDoors(2);
        System.out.println("Updated Doors:" + myCar.getNumberOdDoors());
    }
}
